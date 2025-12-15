import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_10 {
    public Problem_10() {
    }

    public static void main(String[] args) {
        String text = "Visit www.example.com for more information. Check out blog.example.net for latest updates.";
        List<String> domains = extractDomains(text);
        System.out.println("Extracted domains:");
        Iterator var3 = domains.iterator();

        while(var3.hasNext()) {
            String domain = (String)var3.next();
            System.out.println(domain);
        }

    }

    public static List<String> extractDomains(String text) {
        List<String> domains = new ArrayList();
        String regex = "(www\\.[a-zA-Z0-9.-]+|blog\\.[a-zA-Z0-9.-]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            domains.add(matcher.group());
        }

        return domains;
    }
}

