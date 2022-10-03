import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        while(!answer.equals("no")) {
            if(answer.equals("yes")) {
                double num1 = inputNum("первое", scanner);
                char operation = inputOperation(scanner);
                double num2 = inputNum("второе", scanner);
                System.out.println(num1 + " " +  operation + " " + num2 + " = " + 
                        calculator.calculate(num1, num2, operation));
            } else {
                System.out.println("Для продолжения или окончания вычисления введите yes или no");
            }
            answer = scanner.nextLine();
        } 
    }

    private static double inputNum(String position, Scanner scanner) {
        System.out.print("Введите "+ position + " число: ");
        return scanner.nextDouble();
    }

    private static char inputOperation(Scanner scanner) {
        boolean correct = false;
        char operation = ' ';
        System.out.print("Введите знак операции: ");
        while(!correct) {
            operation = scanner.nextLine().charAt(0);
            correct = true;
        }
        return operation;
    }
}