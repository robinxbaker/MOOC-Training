
public class AdvancedAstrology {

    public static void printStars(int number) {
        while (number > 0){
            System.out.print("*");
            number--;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        while (number > 0){
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        for(int i = 1; i <= size; i++){ // i is the amount of stars, size - i can be amount of spaces
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // Base is height * 2 - 1 length across
        // First line is 9 spaces, 1 star, 9 spaces
        // Second line is 8 spaces, 3 stars, 8 spaces
        // All the way down to 10th line, which is just 19 stars
        // After that base is 8 spaces, 3 stars, 8 spaces, then again 8 spaces, 3 stars, 8 spaces
        // for loop for height, then print base depending on width of christmas tree
        // Maybe we can print i * 2 - 1 stars, and spaces can be height * 2 - 1 - that
        // base spaces can be (height * 2 - 4) / 2
        
        for (int i = 1; i <= height; i++){
            int stars = i * 2 - 1;
            int spaces = (height * 2 - 1 - stars) / 2;
            
            printSpaces(spaces);
            printStars(stars);
            //printSpaces(spaces);
            //System.out.println("");
        }
        
        int spaces = (height * 2 - 4) / 2;
        int stars = 3;
        for (int j = 1; j <= 2; j++){
            printSpaces(spaces);
            printStars(stars);
            //printSpaces(spaces);
            //System.out.println("");
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
