package work.space1.string.random;

public class IsNumeric {

    public static boolean isNumeric(String input){

        try {
            Integer.parseInt(input);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
