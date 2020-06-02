public class Calc4 {
    public static int calc(int num1, int num2, char oper) {
        int result;
        result = 0;
        try {
            if (num1 >= 0 & num1 <= 10 & num2 >= 0 & num2 <= 10) {


                switch (oper) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                    //default:
                    // System.out.println("Операция не распознана. Повторите ввод.");
                    // result = calc(num1, num2, getOperation());
                }

            } else {
                throw new Exception("Ivalid value");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
}
