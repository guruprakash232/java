
/*Task 3write programs using all the relational and logical operators(no conditional statements)
 
 Relational operations
 > greater than
 < less than
 >= greater than or equal to
 <= less than or equal to
 == comparative
 
 Logical operations
 && and 
 or ||
 not !
 
 */
package javatask;
import java.util.Scanner;
public class Operations {
	
	public static void main(String[]args) {
		Scanner obj=new Scanner(System.in);
		int  a;
		int b;
		int c;
		int d;
	//ASSIGNMENT
		System.out.println("ASSIGNMENT");
		
		System.out.println("Enter value of A ");
		a=obj.nextInt();
		
		System.out.println("Enter value of B ");
		b=obj.nextInt();
		
		System.out.println("value of A "+a);
		System.out.println("value of B "+b);
		
		System.out.println(a>b);//greater than
		System.out.println(a<b);//less than than
		System.out.println(a>=b);//greater than or equal to 
		System.out.println(a<=b);//less than or equal to
		System.out.println(a==b);//comparative
		
	//LOGICAL
		
		System.out.println("LOGICAL");
		
		System.out.println("Enter value of C ");
		c=obj.nextInt();
		System.out.println("Enter value of D ");
		d=obj.nextInt();
		
		System.out.println("value of A "+a);
		System.out.println("value of B "+b);
		System.out.println("value of C "+c);
		System.out.println("value of D "+d);
		
		System.out.println((a>b)&&(c>d));//and
		System.out.println((a<b)||(c<d));//or
		System.out.println(!(a>b));//not
		System.out.println(!(c<a));//not
		
		
		
	}

}