//write a program to print right star pattern based on row

package javatask;

public class RightStarTriangle
{
	public static void main(String[] args)
	{
		int i,j,star=6;
		for(i=1;i<=star;i++) 
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
