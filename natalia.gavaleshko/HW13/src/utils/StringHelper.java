package utils;

import exceptions.StringFormatException;

public class StringHelper {

    public static String arrayToString(String string, char[] args) throws StringFormatException {
        String b;
        String t;
        if (args == null || args.length == 0) {
            throw new NullPointerException("Error. Expected not null");
        } else {
            b = new String(args);
        }
        if (string.replace(" ", "").isEmpty() || b.replace(" ", "").isEmpty()) {
            throw new StringFormatException("Error. Expected not null");
        } else {
            t = string.toUpperCase().trim() + " " + b.toLowerCase().trim();
        }
        System.out.println("t = " + t);

        return (t.length()%2==0)? t.substring(t.length()/2 - 1,t.length()/2+1): t.substring(t.length()/2,t.length()/2+1);
    }

}