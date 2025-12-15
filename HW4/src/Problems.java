import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problems {
    public Problems() {
    }

    public static void main(String[] args) {
        String regEx1 = "^[a-zA-Z]+\\.\\d+$";
        String problem1 = "abcd.135";
        System.out.println("------------");
        System.out.println(problem1.matches(regEx1));
        String regEx2 = "[a-zA-Z]+\\.(\\d+)";
        String problem2 = "abcd.135uvqz.7tzik.888";
        Pattern pattern2 = Pattern.compile(regEx2);
        Matcher matcher2 = pattern2.matcher(problem2);
        System.out.println("------------");

        while (matcher2.find()) {
            System.out.println(matcher2.group(1));
        }

        String regEx3 = "[a-zA-Z]+\\.(\\d+)";
        String problem3 = "bcd.135\tuvqz.7\ttzik.888\n";
        Pattern pattern3 = Pattern.compile(regEx3);
        Matcher matcher3 = pattern3.matcher(problem3);
        System.out.println("------------");

        while (matcher3.find()) {
            System.out.println(matcher3.group(1));
        }

        String regEx4 = "[a-zA-Z]+\\.(\\d+)";
        String problem4 = "bcd.135\tuvqz.7\ttzik.888\n";
        Pattern pattern4 = Pattern.compile(regEx4);
        Matcher matcher4 = pattern4.matcher(problem4);
        System.out.println("------------");

        while (matcher4.find()) {
            PrintStream var10000 = System.out;
            int var10001 = matcher4.start(1) + 1;
            var10000.println("Start Index: " + var10001 + ", End: " + matcher4.end(1));
        }

        String problem5 = "{0, 2}, {0, 7}, {1, 3}, {2, 4}";
        Pattern pattern5 = Pattern.compile("\\{([^}]+)}");
        Matcher matcher5 = pattern5.matcher(problem5);
        System.out.println("------------");

        while (matcher5.find()) {
            System.out.println(matcher5.group(1));
        }

        String email1 = "abc.123@gmail.com";
        String email2 = "78_Ty@gmail.com";
        String email3 = "abc-34@gmail.com";
        String email4 = "_%+-23Fg@gmail.com";
        System.out.println("------------");
        System.out.println(email1.matches("[a-zA-Z0-9._%+-]+@gmail\\.com"));
        System.out.println(email2.matches("[a-zA-Z0-9._%+-]+@gmail\\.com"));
        System.out.println(email3.matches("[a-zA-Z0-9._%+-]+@gmail\\.com"));
        System.out.println(email4.matches("[a-zA-Z0-9._%+-]+@gmail\\.com"));
    }
}

