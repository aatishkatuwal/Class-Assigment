public class Problem_9 {
    public Problem_9() {
    }

    public static void main(String[] args) {
        String[] urls = new String[]{"https://www.example.com:8080/path/to/page.html", "http://www.example.net/index.html", "https://blog.example.com/category/news/", "https://www.example.edu/about-us/team.html"};
        String[] var2 = urls;
        int var3 = urls.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String url = var2[var4];
            if (isValidURL(url)) {
                System.out.println(url + " - Valid URL");
            } else {
                System.out.println(url + " - Invalid URL");
            }
        }

    }

    public static boolean isValidURL(String url) {
        String regex = "^(http|https)://[a-zA-Z0-9.-]+(:\\d+)?(/[a-zA-Z0-9./_-]*)?$";
        return url.matches(regex);
    }
}
