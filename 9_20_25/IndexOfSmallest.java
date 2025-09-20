
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        // Go through first to find smallest, then go through again to index

        ArrayList<Integer> list = new ArrayList<>();
        
        while (true){
            
            int response = Integer.valueOf(scanner.nextLine());
            
            if (response == 9999){
                break;
            }
            list.add(response);
        }
        
        ArrayList<Integer> listSmallest = new ArrayList<>();
        int smallest = 999999999;
        
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) < smallest){
                smallest = list.get(i);
            }
        }
        
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == smallest){
                listSmallest.add(i);
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        
        for (int i = 0; i < listSmallest.size(); i++){
            System.out.println("Found at index: " + listSmallest.get(i));
        }
    }
}
