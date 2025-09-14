
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        
        int response1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        
        int response2 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The sum of the numbers is " + (response1 + response2));

    }
}
