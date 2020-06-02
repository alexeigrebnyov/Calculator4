import java.util.Arrays;
public class Revers4 {
    public static int revers(String[] roman, int[] arabian, String number) {
        int value;
        //String[] roman = new String[] {"I","II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        //String[] arabian = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int romanIndex = Arrays.asList(roman).indexOf(number);
        if (romanIndex >= 0) {
            value = arabian [romanIndex];
        } else {
            value = Integer.parseInt(number);
        }
        return value;
    }
}
