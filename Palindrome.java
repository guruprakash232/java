//write a program to find the palindrome or not using string

package javatask;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner (System.in);
		 
		String val,result="";
		
		System.out.println("ENTER THE STRING: ");
		val=obj.next();
		System.out.println("THE STRING IS "+val);
		for(int i=val.length()-1;i>=0;i--) {
			
			result+=val.charAt(i);//result=result+val.charAT(i);charAt get 1 value
			System.out.println(result);//printing result
			
		}
		
		if(result.equals(val))
	        System.out.println("THE GIVEN STRING IS PALINDROME");
		else
			System.out.println("THE GIVEN STRING IS NOT A PALINDROME");
	        
		

	}

}
