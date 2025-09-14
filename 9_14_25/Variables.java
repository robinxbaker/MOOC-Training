
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        
        String stringResponse = scan.nextLine();
        
        System.out.println("Give an integer:");
        
        int intResponse = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        
        double doubleResponse = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        
        boolean booleanResponse = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + stringResponse);
        System.out.println("You gave the integer " + intResponse);
        System.out.println("You gave the double " + doubleResponse);
        System.out.println("You gave the boolean " + booleanResponse);
        

    }
}
