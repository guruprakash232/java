//Write a Java program to print the multiples of 2 or not based on the user input

package javatask;
import java.util.*;

public class MultiplesOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		
		int a;

		System.out.println("ENTER THE NUMBER: ");
		a=obj.nextInt();
		
		if(a % 2 == 0) { //condition
			System.out.println("THE NUMBER "+a+" IS THE MULTIPLE OF 2");	
		}
		else {
			System.out.println("THE NUMBER "+a+" IS NOT THE MULTIPLE OF 2");
		}

	}

}
