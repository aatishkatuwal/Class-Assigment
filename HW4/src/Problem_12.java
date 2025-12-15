import java.util.Scanner;

public class Problem_12 {
    public Problem_12() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        boolean containsOnlyAlphabetic = checkAlphabetic(input);
        if (containsOnlyAlphabetic) {
            System.out.println("The string contains only alphabetic characters.");
        } else {
            System.out.println("The string contains non-alphabetic characters.");
        }

    }

    public static boolean checkAlphabetic(String input) {
        String regex = "^[a-zA-Z]+$";
        return input.matches(regex);
    }
}

