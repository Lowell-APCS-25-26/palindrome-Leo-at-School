package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s){
        s = lower(s);

        return reverse(s).equals(s);
    }
    public String reverse(String s){
        String n = new String();
        
        for (int i = s.length() - 1; i >= 0; i--){
            n += Character.toString(s.charAt(i));
        }

        return n;
    }

    public String lower(String s){
        String n = new String();
        
        char sCharacter;
        for (int i = 0; i < s.length(); i++){
            sCharacter = s.charAt(i);

            //If the ascii code for the character is betweeen the values of the upper case letters,
            //add an offset to convert to the ascii code of the lowercase letters
            if (sCharacter >= 65 && sCharacter <= 90){
                sCharacter = sCharacter + 32;
            }

            n += Character.toString(sCharacter);
        }

        return n;
    }
}
