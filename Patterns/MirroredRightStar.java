//write a java program to print a mirrored right star 

package javatask;

public class MirroredRightStar {
	
	public static void main(String[] args) {
		
		int star=10;
		for(int i=1;i<=star;i++) 
		{
			
			for(int j=star;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print("*");
				
			}
			
			System.out.println("");
		}
	}
}