package withMap;

import java.util.HashMap;

public class EncryptionAndDecryption {
    public static HashMap<Integer, Character> alphabet = new HashMap<>();
    public static void initiate(){
        for (int i = 0; i < 26; i++) {
            alphabet.put(i,(char)(97+i));
        }
    }
    public static void encrypt(String text, int rotNum) {
        char[] textChars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            int index = text.charAt(i)-97;
            textChars[i] = alphabet.get((index+rotNum+26000000)%26);
        }
        for (char i : textChars) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void decrypt(String text, int rotNum) {
        char[] textChars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            int index = text.charAt(i)-97;
            textChars[i] = alphabet.get((index-rotNum+26000000)%26);
        }
        for (char i : textChars) {
            System.out.print(i);
        }
        System.out.println();
    }
}
