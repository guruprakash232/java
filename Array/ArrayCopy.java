
//Write a program to copy an array by itrating the array

package javatask;

public class ArrayCopy {
    public static void main(String[] args)
    {
        
        int[] originalArray = {1, 2, 3, 4, 5};

        
        int[] copiedArray = new int[originalArray.length];

        
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        
        System.out.println("Original Array:");
        printArray(originalArray);

        System.out.println("Copied Array:");
        printArray(copiedArray);
    }

    
    public static void printArray(int[] array) 
    {
        for (int value : array) 
        {
            System.out.print(value + " ");
        }
        System.out.println();  
    }
}
