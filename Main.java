import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 'new' for Scanner
        System.out.println("welcome to calculator cli");
        System.out.println("choose ur first number");
        int num1 = sc.nextInt();
        System.out.println("choose ur second number");
        int num2 = sc.nextInt(); 
        System.out.println("choose ur sign 1:+ 2:- 3:* 4:/");
        int sign = sc.nextInt();

        int res; // Declare reresponse
        switch (sign) {
            case 1:
                res = num1 + num2;
                break;
            case 2:
                res = num1 - num2;
                break;
            case 3:
                res = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    res = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    res = 0;
                }
                break;
            default:
                System.out.println("invalid operation");
                res = 0; // Initialize res for default case
        }

        System.out.println("Your result is " + res);

        sc.close(); // Ensure Scanner is closed
    }
}