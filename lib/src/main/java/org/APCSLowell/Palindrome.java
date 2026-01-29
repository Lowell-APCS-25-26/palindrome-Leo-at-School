package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s) {
        return reverse(s).equals(s);
    }
    public String reverse(String s) {
        String n = new String();
        
        for (int i = s.length() - 1; i >= 0; i++){
            if (i == s.length() - 1){
                n += s.substring(i);
            } else {
                n += s.substring(i, i + 1);
            }
        }

        return n;
    }
}
