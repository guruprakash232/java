

//Write a program to sum values of an array

package javatask;

public class ArraySum {
	
	public static void sumArray(int[] arr) 
	{
		int sum = 0;
		for(int i = 0; i <= arr.length-1; i++)
		{
			if(arr.length == 1) {
				sum = arr[0];
				System.out.println("The Array has only One Element "+sum);
				break;
			}
			sum += arr[i];
		}
		System.out.println("The total Sum of the Array is "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {100,120,250,56,150};
		sumArray(arr);
		
	}

}