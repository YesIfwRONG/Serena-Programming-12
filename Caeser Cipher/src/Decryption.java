public class Decryption {
    public static void decrypt(String word, int rotNum){
        char[] wordChars = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            wordChars[i] = (char)(97 + (((int)word.charAt(i)-97) + 26-rotNum) % 26);
        }
        for (char i : wordChars) {
            System.out.print(i);
        }
        System.out.println();
    }
}
