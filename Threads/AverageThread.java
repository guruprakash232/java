//Write a program  that Calculates 5 Subjects using threads

package javatask;

class Subject extends Thread
{
	public void run()
	{
		int[] subject=new int[5];
		subject[0]=55;
		subject[1]=78;
		subject[2]=85;
		subject[3]=60;
		subject[4]=95;
		
		float sum=subject[0]+subject[1]+subject[2]+subject[3]+subject[4];
		
		System.out.println("Total Value : "+sum);
		
		float average=sum/subject.length;
		
		System.out.println("Average Value : "+average);
	}
}


public class AverageThread
{
	public static void main(String args[])
	{
		Subject t1=new Subject();
		t1.start();
		
	}
}