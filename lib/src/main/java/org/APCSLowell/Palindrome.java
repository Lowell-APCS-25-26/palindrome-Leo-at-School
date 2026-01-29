package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s) {
        return reverse(s).equals(s);
    }
    public String reverse(String s) {
        String n = new String();
        
        for (int i = s.length() - 1; i >= 0; i++){
            n += Character.toString(s.charAt(i));
        }

        return n;
    }
}
