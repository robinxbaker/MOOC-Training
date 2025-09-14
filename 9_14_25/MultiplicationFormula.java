
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        
        int int1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        
        int int2 = Integer.valueOf(scanner.nextLine());
        
        System.out.println(int1 + " * " + int2 + " = " + (int1 * int2));

    }
}
