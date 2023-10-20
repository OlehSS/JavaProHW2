package work.space1.string.random;

import java.util.Random;

public class DifferentRandom {

    private DifferentRandom() {};

    private static final Random RND = new Random();

    public static String generateWord(int length){
        StringBuilder word = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            word.append(generateSymbol());
        }
        return word.toString();
    }

    public static char generateSymbol(){
        return (char)RND.nextInt('a', 'z' + 1);
    }

    public static String generateNumeric(int length){
        StringBuilder num = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            num.append(generateNum());
        }
        return num.toString();
    }

    public static int generateNum(){
        return RND.nextInt(0, 10);
    }

}
