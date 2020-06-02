import java.util.Arrays;
public class Nums4 {
    public static int getnums(String number1, String number2, String[] roman, int value) {
        int roman1 = Arrays.asList(roman).indexOf(number1);
        int roman2 = Arrays.asList(roman).indexOf(number2);
        int sum = roman1 + roman2;
        int abs = Math.abs(sum);
        int num = 0;

        try {
            if (abs < roman1 || abs < roman2) {
                throw new Exception("Invalid expression");

            } else {
                num = value;
            }
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        return num;
    }
}