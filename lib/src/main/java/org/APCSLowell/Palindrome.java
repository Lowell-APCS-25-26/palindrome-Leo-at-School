package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s){
        s = lowerPalindrome(s);

        return reversePalindrome(s).equals(s);
    }
    private String reversePalindrome(String s){
        String n = new String();
        
        for (int i = s.length() - 1; i >= 0; i--){
            n += Character.toString(s.charAt(i));
        }

        return n;
    }

    private String lowerPalindrome(String s){
        String n = new String();
        
        char sCharacter;
        for (int i = 0; i < s.length(); i++){
            sCharacter = s.charAt(i);

            if (!isAlphabet(sCharacter)){
                continue;
            }

            //If the ascii code for the character is betweeen the values of the upper case letters,
            //add an offset to convert to the ascii code of the lowercase letters
            if (sCharacter >= 65 && sCharacter <= 90){
                sCharacter = (char)((int)sCharacter + 32);
            }

            n += Character.toString(sCharacter);
        }

        return n;
    }

    private boolean isAlphabet(char c){
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }
}
