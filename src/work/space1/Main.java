package work.space1;

import java.util.Scanner;

import static work.space1.string.random.IsNumeric.isNumeric;

public class Main {
    public static void main(String[] args) {

//        System.out.println(DifferentRandom.generateWord(8));
//        System.out.println(StringRandom.getText(1000));

//        System.out.println(DifferentRandom.generateNumeric(4));

        Scanner scr = new Scanner(System.in);
        String scrScan = scr.nextLine();

//        String[] newArray = splitWords(scrScan);
//
//        System.out.println(Arrays.toString(newArray));

        System.out.println(isNumeric(scrScan));
    }
}