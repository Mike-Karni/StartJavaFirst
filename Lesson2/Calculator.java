public class Calculator {

    public double calculate(double num1, double num2, char operation) {
        switch(operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '%':
                return num1 % num2;
            case '^':
                for(int i = 1; i <= num2; i++) {
                    double result = 1;
                    result *= num1;
                }
                return result;
            default:
                return 0;
        }
    }
}