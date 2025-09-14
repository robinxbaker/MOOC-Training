import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        
        int gift = Integer.valueOf(scan.nextLine());
        
        double tax;
        
        if (gift < 5000){
            tax = 0;
        } else if (gift < 25000){
            tax = (gift - 5000) * 0.08 + 100;
        } else if (gift < 55000){
            tax = (gift - 25000) * 0.1 + 1700;
        } else if (gift < 200000){
            tax = (gift - 55000) * 0.12 + 4700;
        } else if (gift < 1000000){
            tax = (gift - 200000) * 0.15 + 22100;
        } else {
            tax = (gift - 1000000) * 0.17 + 142100;
        }
        if (tax == 0){
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + tax);
        }
    }
}
