import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_8 {
    public static void main(String[] args) {
        String[] emails = {
                "abc.123@gmail.com",
                "78_Ty@gmail.com",
                "abc-34@gmail.com",
                "_%+-23Fg@gmail.com",
                "wrongEmail@yahoo.com",
                "another.wrong@outlook.com"
        };
        String gmailRegex = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";
        Pattern pattern = Pattern.compile(gmailRegex);
        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " is a valid Gmail address.");
            } else {
                System.out.println(email + " is NOT a valid Gmail address.");
            }
        }
    }
}
