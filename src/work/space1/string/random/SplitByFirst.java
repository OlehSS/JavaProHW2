package work.space1.string.random;

import java.util.Scanner;

public class SplitByFirst {

    public static String[] splitWords(String input){
        String[] parts = input.split("[! ]+");
        String[] newParts = new String[parts.length + 1];

        for (int i = 0; i < parts.length; i++) {
            newParts[i] = parts[i];
        }

        newParts[newParts.length - 1] = "";

        return newParts;
    }

}


