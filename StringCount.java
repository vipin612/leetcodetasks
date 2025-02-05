import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int[] counts = new int[3];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) counts[0]++;
            else if (Character.isLowerCase(c)) counts[1]++;
            else if (!Character.isDigit(c) && !Character.isWhitespace(c)) counts[2]++;
        }

        System.out.println("Uppercase letters: " + counts[0] + 
                         "\nLowercase letters: " + counts[1] + 
                         "\nSpecial characters: " + counts[2]);
        scanner.close();
    }
}
