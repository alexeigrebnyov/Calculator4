import java.io.*;
public class Operation4 {
    public static char getOperation(char a, char b, char c, char d, char e, char f) throws IOException {
        //String str = getString();
        //int length = str.length();
        char oper;
        oper = '0';

        // char searchChar1 = '+';
        // char searchChar2 = '-';
        //char searchChar3 = '*';
        //char searchChar4 = '/';
        //char searchChar5 = 'S';
        try {

            if (a == '+' || b == '+' || c == '+' || d == '+' || e == '+' || f == '+') {
                oper = '+';
            } else {
                if (a == '-' || b == '-' || c == '-' || d == '-' || e == '-' || f == '-') {
                    oper = '-';
                } else {
                    if (a == '*' || b == '*' || c == '*' || d == '*' || e == '*' || f == '*') {
                        oper = '*';
                    } else {
                        if (a == '/' || b == '/' || c == '/' || d == '/' || e == '/' || f == '/') {
                            oper = '/';
                        } else {
                            throw new Exception("Invalid operation");


                        }
                    }
                }
            }
        } catch (Exception ex) {

            System.out.println(ex.getMessage());

        }

        return oper;
    }
}
