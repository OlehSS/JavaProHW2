package work.space1.string.random.together;

import java.util.Locale;
import java.util.Random;

public class StringRandom {

    private static final Random RND = new Random();

    private static final String[] SYMBOLS = {"!", "?", ".", "..."};

    private StringRandom(){

    }

    public static String getWord(int length){

        StringBuilder word = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            word.append(generateSymbol());
        }
        return word.toString();
    }

    private static char generateSymbol(){
        return (char)RND.nextInt('a', 'z' + 1);
    }


    public static String getSentence(int length){
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sentence.append(getWord(RND.nextInt(2, 8))).append(" ");
        }
        sentence.delete(sentence.length() - 1, sentence.length());
        sentence.append(SYMBOLS[RND.nextInt(0, SYMBOLS.length)]);
        sentence.replace(0, 1, String.valueOf(sentence.charAt(0)).toUpperCase(Locale.ROOT));
        return sentence.toString();
    }

    public static String getText(int length){

        StringBuilder text = new StringBuilder();
        for (int i = 0; i < length; i++) {
            text.append(getSentence(RND.nextInt(3, 7))).append("\n");
        }
        return text.toString();
    }


}
