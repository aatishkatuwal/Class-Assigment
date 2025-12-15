import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_11 {
    public Problem_11() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String mainString = scanner.nextLine();
        System.out.println("Enter the substring to be counted:");
        String substring = scanner.nextLine();
        int count = countSubstringOccurrences(mainString, substring);
        System.out.println("The substring '" + substring + "' occurs " + count + " times in the main string.");
    }

    public static int countSubstringOccurrences(String mainString, String substring) {
        String escapedSubstring = Pattern.quote(substring);
        Pattern pattern = Pattern.compile(escapedSubstring);
        Matcher matcher = pattern.matcher(mainString);

        int count;
        count = 0;
        while (matcher.find()) {
            ++count;
        }

        return count;
    }
}
