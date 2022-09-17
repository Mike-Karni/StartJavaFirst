public class Calculator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int result = 1;
        char sign = '*';
        if(sign == '/') {
            result = num1 / num2;
        } else if(sign == '+') {
            result = num1 + num2;
        } else if(sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if(sign == '%') {
            result = num1 % num2;
        } else if (sign == '^') {
            for(int i = 1; i <= num2; i++) {
                result *= num1;
            }
        } else {
            System.out.println("Введите правильное действие над двумя числами: +, -, *, /, ^, %");
         }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result); 
    }
}