
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int given = Integer.valueOf(scanner.nextLine());
        
        while (given <= 100){
            System.out.println(given);
            given++;
        }
    }
}
