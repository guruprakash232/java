package javatask;

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int row=scan.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=row;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}