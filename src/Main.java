public class Main {
    private static final String REGEX = "/(users|user)/[A-Za-z0-9]+/";
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String url = "http://www.example.com/users/john123/";
        preHandle(url);
       // Output: http://www.example.com/users/jane456/

    }
    public static void preHandle(String url){
        String newUsername = "jane4";
        String newUrl = url.replaceAll(REGEX, "/$1/" + newUsername + "/");
        System.out.println(newUrl);
    }

}