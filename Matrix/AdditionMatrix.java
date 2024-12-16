package javatask;

import java.util.*;

public class AdditionMatrix {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int row, col;
        
        System.out.println("Enter the Number of Rows for the Matrix: ");//rows
        row = sc.nextInt();
        
        System.out.println("Enter the Number of Columns for the Matrix: ");//columns
        col = sc.nextInt();

        int a[][] = new int[row][col];//declaration
        int b[][] = new int[row][col];//declaration
        int c[][] = new int[row][col];//declaration

//input 1  
        
        System.out.println("Enter the elements of Matrix 1: ");
        for (int i = 0; i < row; i++) { 
            for (int j = 0; j < col; j++) { 
                System.out.print("A[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

//input 2
        
        System.out.println("Enter the elements of Matrix 2: ");
        for (int i = 0; i < row; i++) { 
            for (int j = 0; j < col; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                b[i][j] = sc.nextInt();
            }
        }
        
// Perform Addition
        
        System.out.println("\nMatrix  Addition:\n");
		for(int i = 0; i < row; i++) {
	
			for(int j = 0; j < col; j++) {
		
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			
			}
		
			System.out.println();
		}sc.close();
	}
}
