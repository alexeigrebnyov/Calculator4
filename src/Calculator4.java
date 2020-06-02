import java.io.*;
public class Calculator4 {
    public static void main(String[] args) throws IOException {

        System.out.println("Input");

        Input4 input = new Input4();

        String str = input.getString();

        int length = str.length();

        int x1;
        int x2;
        int x3;
        int x4;
        int x5;
        int x6;
        x1 = length;
        if ((length-1)>=1) {
            x2 = (length-1);

        } else {
            x2 = length;
        }
        if ((length-2)>=1) {
            x3 = (length-2);

        } else {
            x3 = length;
        }
        if ((length-3)>=1) {
            x4 = (length-3);

        } else {
            x4 = length;
        }

        if ((length-4)>=1) {
            x5 = (length-4);

        } else {
            x5 = length;
        }

        if ((length-5)>=1) {
            x6 = (length-5);

        } else {
            x6 = length;
        }



        char a;
        char b;
        char c;
        char d;
        char e;
        char f;

        char[] numbers = str.toCharArray();

        a = numbers[length-x1];
        b = numbers[length-x2];
        c = numbers[length-x3];
        d = numbers[length-x4];
        e = numbers[length-x5];
        f = numbers[length-x6];

        Operation4 obj2 = new Operation4();

        char oper = obj2.getOperation(a, b, c, d, e, f);

        int index1=str.indexOf(oper);
        int indexcrit = index1-1;

        String number2 = str.substring(index1+1, length);
        String number1 = str.substring(0, index1);

        String[] roman = new String[] {"I","II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XII", "XIV", "XV", "XVI", "XVIII", "XX", "XXI", "XXIV", "XXV", "XXVII", "XXVIII", "XXX", "XXXII", "XXXV", "XXXVI", "XL", "XLII", "XLV", "XLVIII", "XLIX", "L", "LIV", "LVI", "LX", "LXIII", "LXIV", "LXX", "LXXII", "LXXX", "LXXXI", "XC", "C"};
        String[] arabianstring = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int[] arabian = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 24, 25, 27, 28, 30, 32, 35, 36, 40, 42, 45, 48, 49, 50, 54, 56, 60, 63, 64, 70, 72, 80, 81, 90, 100} ;



        int value1;
        int value2;
        Revers4 revers = new Revers4();
        value1 = revers.revers(roman, arabian, number1);
        value2 = revers.revers(roman, arabian, number2);


        int num1 = 0;
        int num2 = 0;

        Nums4 getn = new Nums4();
        num1 = getn.getnums(number1, number2, roman, value1) ;
        num2 = getn.getnums(number1, number2, roman, value2) ;


        Calc4 obj = new Calc4();
        int result = obj.calc (num1, num2, oper);
        Avers4 avr = new Avers4();
        String result1 = avr.avers(number1, roman, arabian, result);
        System.out.println("Output");
        System.out.println(result1);

    }
}

