import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {3, 2, 5, 4, 8};

    System.out.println( Arrays.toString(values) );

    swap(values, 1, 0);
    System.out.println( Arrays.toString(values) );

    swap(values, 0, 3);
    System.out.println( Arrays.toString(values) );
  
        System.out.println("smallest: " + smallest(values));
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
    }
    
    public static int smallest(int[] array) {
    // write the code here
    int j = array[0];
    for (int i = 0; i < array.length;i++){
        if (j > array[i]){
            j=array[i];
        }   
    }
    return j;
    }
    
    public static int indexOfTheSmallest(int[] array) {
    // code goes here
    int j = array[0];
    int x = 0;
    for (int i = 0; i < array.length;i++){
        if (j > array[i]){
            j=array[i];
            x=i;
        }   
    }
    return x;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
    // write the code here
    int j = array[index];
    int x = 0;
    for (int i = index; i < array.length;i++){
        if (j >= array[i]){
            j=array[i];
            x=i;
        
        }   
    }
    return x;
    }
    
    public static void swap(int[] array, int index1, int index2) {
    // code goes here
    int  i = array[index1];
    int j = array[index2];
    
    array[index1] = j;
    array[index2] = i;
    }
    
    public static void sort(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallestIndex);
        }
        
    }
 
  

    
}
  
  


