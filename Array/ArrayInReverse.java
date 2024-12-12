/*Write a job program to print 20 to 1 in reverse order 
 * using array without using build in functions 
 */

package javatask;

public class ArrayInReverse 
{
	public static void main(String[] args)
	{
		System.out.println("To Print the Reverse Array");
		
		int num[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		System.out.println("The Reversed Order is : ");
		
		for (int i = (num.length)-1; i>=0; i--) {
			
			System.out.println(num[i] + " ");
			
		}
	}
}