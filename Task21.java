package javatask;

import java.util.Scanner;



public class Task21 {
	public static void print(int n,int l)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<l;j++)
			{
				if((i==0 && j%3!=0)||(i==1 && j%3==0)||i-j==2||j+i==8)			
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
					
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Task21 h=new Task21();
		h.print(6,7);
		

	}

}
