public class Problem_6 {
    public Problem_6() {
    }

    public static String removeLetters(String input) {
        return !input.matches(".*[pqrPQR].*") ? "Not found." : input.replaceAll("[pqrPQR]", "");
    }

    public static void main(String[] args) {
        String input = "Pork, Beef, Chicken, Lamb are meats. ABCpQr are random";
        String output = removeLetters(input);
        System.out.println("Returned: " + output);
    }
}

