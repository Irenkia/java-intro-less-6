package org.example;

public class TextWork {
    public static boolean isText(String text) {
        if (text != "") {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(String text) {
        if (isText(text)) {
            String result = text.toLowerCase().trim().replaceAll("[^a-z]", "");
            StringBuffer sbr = new StringBuffer(result);
            sbr.reverse();
            String data = sbr.toString();
            return result.equals(data);
        }
        return false;
    }

    public static int calculateLengthString(String text) {
        if (isText(text)) return text.length();
        return -1;
    }

}
