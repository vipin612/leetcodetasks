class Solution {
    public int search(int[] nums, int target) {
        int pivot = searchPivot(nums);
        if(pivot==-1){
            return searchElement(nums,target,0,nums.length-1);
        }
        return (searchElement(nums,target,0,pivot)!=-1)?searchElement(nums,target,0,pivot):searchElement(nums,target,pivot+1,nums.length-1);
    }

    static int searchPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }else if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }else if(nums[start]>nums[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    int searchElement(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid = start +(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
