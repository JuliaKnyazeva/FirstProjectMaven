

public class Main {


    public static String pad(String text, int len, String substr) {

       if (text == null) {
           return null;
       }

        String result = text;
        while (result.length() < len) {
            result += substr;
        }
        return result;
    }

    public static void main(String[] args) {

    }



}
