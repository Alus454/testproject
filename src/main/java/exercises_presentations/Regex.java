package exercises_presentations;

import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        Pattern peselPattern = Pattern.compile("[0-9]{11}");
        validate(peselPattern, "90012213499");
        validate(peselPattern, "9001221349");
        validate(peselPattern, "9001221349a");
        System.out.println("id: "+ id("90012213499"));
        System.out.println("id: "+ id("900122134999"));
        System.out.println("id: "+ email("alukard454@gmail.com"));


    }
    public static void validate(Pattern pattern, String text) {
        System.out.println(text + " maches pattern: "+ pattern.matcher(text).matches());

    }
    public static boolean id(String id) {
        Pattern idPattern = Pattern.compile("[0-9]{11}");
        return idPattern.matcher(id).matches();


    }
    public static boolean email(String email) {
        Pattern emailPattern = Pattern.compile("");
        return emailPattern.matcher(email).matches();


    }


}
