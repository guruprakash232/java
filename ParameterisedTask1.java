package javatask;


import java.util.Scanner;

public class ParameterisedTask1 {
	int EmpId,salary,workExperience;
	String name;
	ParameterisedTask1(int i, int s,int w,String n)
	{
		EmpId=i;
		salary =s;
		workExperience=w;
		name=n;
	}
	 void display()
	 {
		 System.out.println("EMPID :"+EmpId+"\n"+"NAME :"+name+"\n"+"SALARY :"+salary+"\n"+"WORKEXPERIENCE :"+ workExperience);
	 }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1.Employer Id/2.Salary/3.WorkExperience/4.Name");
		int i = sc.nextInt();
		int s=sc.nextInt();
		int w=sc.nextInt();
		String n=sc.nextLine();
	
		ParameterisedTask1 t1=new ParameterisedTask1( i, s, w, "Guru");
		t1.display();
		}
}
		

