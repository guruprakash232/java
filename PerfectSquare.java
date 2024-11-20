/*write a Java program to print the number is the value of
 square or not Ex:25,36,49,64 is a perfect square
 */


package javatask;
import java.util.*;
public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner (System.in);
		int a,count=0;
		System.out.println("ENTER THE NUMBER ");
		a=obj.nextInt();
		System.out.println("THE NUMBER IS "+a);
		
	for(int i=1;i<=a;i++)
	{
		if(i*i==a)
		{
			count++;
					}
	}
if(count==1)
	System.out.println("THE GIVEN NUMBER IS PERFECT SQUARE");
else
	System.out.println("THE GIVEN NUMBER IS NOT A PERFECT SQUARE");		
	

	}

}
