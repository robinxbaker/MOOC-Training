
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveInputs = 0;
        int positiveSum = 0;
        
        while (true){
            int response = Integer.valueOf(scanner.nextLine());
            
            if (response == 0){
                break;
            }
            
            if (response > 0){
                positiveInputs = positiveInputs + 1;
                positiveSum = positiveSum + response;
            }
        }
        if (positiveSum > 0){
            System.out.println((double) positiveSum / positiveInputs);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
