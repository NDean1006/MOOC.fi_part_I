public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount){
            System.out.print("*");
            i++;
        }
        System.out.println("");
        
    }

    public static void printWhitespaces(int amount) {
        int i = 0;
        while (i < amount){
            System.out.print(" ");
            i++;
        }
        // 40.1
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 0;
        int spaces = size - 1; 
        while (i<size){
            printWhitespaces(spaces);
            printStars(size-spaces);
            i++;
            spaces--;
            
        
        }
        
        
    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 0;
        int spaces = height - 1; 
        int stars = 1;
        while (i<height){
            printWhitespaces(spaces);
            printStars(stars);
            stars+=2;
            i++;
            spaces--;
            
        
        }
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3);
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
