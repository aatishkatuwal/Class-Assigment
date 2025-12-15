public class Problem_7 {
    public Problem_7() {
    }

    public static boolean containsOnlyAllowedCharacters(String input) {
        return input.matches("[a-zA-Z0-9]+");
    }

    public static void main(String[] args) {
        String input1 = "AbCdEfG123";
        String input2 = "AbCdEfG123$%^";
        if (containsOnlyAllowedCharacters(input1)) {
            System.out.println(input1 + " contains only allowed characters.");
        } else {
            System.out.println(input1 + " contains characters other than a-z, A-Z, and 0-9.");
        }

        if (containsOnlyAllowedCharacters(input2)) {
            System.out.println(input2 + " contains only allowed characters.");
        } else {
            System.out.println(input2 + " contains characters other than a-z, A-Z, and 0-9.");
        }

    }
}
