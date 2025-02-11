import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        CalOp calc = new CalOp(); 

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

         System.out.print("Choose an operation: (+, -, *, /): ");
        char op = scanner.next();

        double res;

           switch (op) {
            case '+':
                res = calc.add(num1, num2);
                break;
            case '-':
                res = calc.subtract(num1, num2);
                break;
            case '*':
                res = calc.multiply(num1, num2);
                break;
            case '/':
                res = calc.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operator! Please choose +, -, *, or /.");
                return;
        }

        System.out.println("Result: " + res);

        scanner.close();
    }
}
