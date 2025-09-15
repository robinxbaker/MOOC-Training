
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        
        int response = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Where from?");
        
        int response2 = Integer.valueOf(scanner.nextLine());
        
        while(response2 <= response){
            System.out.println(response2);
            response2++;
        }
    }
}
