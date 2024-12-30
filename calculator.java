import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("enter 'X' to start or 'x' for exit ");
            String input = sc.next();
            if (input.equals("x")) {
                System.out.println("Exiting calculator...");
                break;
            }
            System.out.println("Enter the first number");
            int num1=sc.nextInt();
            System.out.println("Enter operator (+, -, *, /):");
            char operator = sc.next().charAt(0);

            System.out.println("Enter second number:");
            int num2=sc.nextInt();
            double result;
            switch (operator) {
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
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator. Please use one of +, -, *, or /.");
                    continue;
            }

            System.out.println("Result of : " +num1+operator+num2+" is "+ result);
        }
    }
}
