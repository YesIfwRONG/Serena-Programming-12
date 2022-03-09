import java.lang.invoke.WrongMethodTypeException;
import java.util.HashSet;

public class Words {
    private static HashSet<String>words = new HashSet<>();
    private static int differentWords = 0;
    private static String word;

    public static String convertWords(String word){
        Words.word = word.toLowerCase().replace(",","").replace(".","")
                .replace("\"","").replace(";","").replace(":","")
                .replace("?","").replace(")","").replace("(","")
                .replace("!","");
        if(Words.word.length()>1) {
            int lst = Words.word.length() - 1;
            if (Words.word.charAt(lst) == '-' || Words.word.charAt(lst) == '\'' || Words.word.charAt(lst) == '\"') {
                Words.word = Words.word.substring(0, lst);
            } else if (Words.word.substring(lst - 1, lst+1).equals("'s")) {
                Words.word = Words.word.substring(0, lst - 1);
            } else if (Words.word.charAt(0) == '\'' || Words.word.charAt(0) == '-' || Words.word.charAt(0) == '\"') {
                Words.word = Words.word.substring(1);
            }
        }
        addWord(Words.word);
        return Words.word;
    }

    public static void addWord(String word) {
        if (word != null){
            words.add(word);
            updateWords();
        }
    }

    public static void  updateWords(){
        differentWords = words.size();
    }

    public static int getDifferentWords() {
        return differentWords;
    }

    public static void checkHashSet(){
        for (Object i : words) {
            System.out.println(i);
        }
    }
}
