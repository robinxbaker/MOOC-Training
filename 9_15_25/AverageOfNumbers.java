
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputs = 0;
        double sum = 0;
        
        while (true){
            System.out.println("Give a number:");
            
            int response = Integer.valueOf(scanner.nextLine());
            
            if (response == 0){
                break;
            }
            
            inputs = inputs + 1;
            sum = sum + response;
        }
        System.out.println("Average of the numbers: " + (sum / inputs));
    }
}
