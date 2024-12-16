package javatask;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row, col;

        
        System.out.println("Enter the Number of Rows for the Matrix: ");// Input Rows
        row = sc.nextInt();
        System.out.println("Enter the Number of Columns for the Matrix: ");// Input Columns
        col = sc.nextInt();

        
        int a[][] = new int[row][col];// Declare Matrix
        int b[][] = new int[row][col];// Declare Matrix
        int c[][] = new int[row][col];// Declare Matrix

// Input for Matrix 1
        
        System.out.println("Enter the elements of Matrix 1: ");
        for (int i = 0; i < row; i++) { 
            for (int j = 0; j < col; j++) { 
                System.out.print("A[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

// Input for Matrix 2
        
        System.out.println("Enter the elements of Matrix 2: ");
        for (int i = 0; i < row; i++) { 
            for (int j = 0; j < col; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                b[i][j] = sc.nextInt();
            }
        }

 // Perform matrix multiplication
        
        System.out.println("\nMatrix after Multiplication:\n");
        for (int i = 0; i < row; i++) { 
            for (int j = 0; j < col; j++) { 
                c[i][j] = 0;
                for (int k = 0; k < col; k++) { 
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " "); 
            }
            System.out.println();
        }
        sc.close();
    }
}