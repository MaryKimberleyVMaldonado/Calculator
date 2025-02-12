import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner();

        CalOp calc = new CalOp(); 

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

         System.out.print("Choose an operation: (+, -, *, /): ");
<<<<<<< HEAD
        char op = scanner.next().charAt(0); 
=======
        char op = scanner.next();
>>>>>>> 3bbe9475423ccf1d38f4a42228d40efedd1afee6

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
