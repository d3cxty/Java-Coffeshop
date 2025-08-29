import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Welcome to our coffe shop sir");
        System.out.println("enter the drink u want sir?");
        String DrinkType = Sc.nextLine();
        System.out.println("Enter the prep tym?");
        int PrepTime = Sc.nextInt();

        CoffeeShop order1 = new CoffeeShop();
        order1.makeOrder(DrinkType,PrepTime);
        order1.GetOrder();
        order1.isQuick();





    }
}