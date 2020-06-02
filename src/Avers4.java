import java.util.Arrays;
public class Avers4 {
    public static String avers(String number1, String[] roman, int[] arabian, int result) {
        Arrays.sort(arabian);
        String result1;
        int indexresult = Arrays.binarySearch(arabian, result);
        if (Arrays.asList(roman).indexOf(number1) >= 0) {
            result1 = roman[indexresult];

        } else {
            result1 = Integer.toString(result);
        }
        return result1;
    }
}
