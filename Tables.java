//write a program to print a table of any number between 1 to 10 using for loop


package javatask;
import java.util.*;
public class Tables {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("ENTER NUMBER 1 TO 10");
		int a=obj.nextInt();
		if(a<=10) {
			System.out.println("THE MULTIPLICATION TABLE IS: "+a);	
			for (int i = 1; i <= 10; i++)
			{
				System.out.println(i + " x " + a + " = " + (i * a));	
		    }
		}
            else {
				System.out.println("ENTER NUMBER BETWEEN 1 TO 10");
			}
	}
	}
