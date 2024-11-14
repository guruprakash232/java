package javaprogram;

public class AssignmentOperator {
	public static void main(String[]args) {
		int num=10;
		String name="java";
		System.out.println("num"+num);
		System.out.println("num"+name);
		
		//+=operator
		
		int a=10;
		a+=10;//a=a+10
		System.out.println("Value of a"+a);
		
		//&&(and) operator > greater
		System.out.println("&&-and operator");
		System.out.println((5>3)&&(8>5));
		//&&(and) operator < lesser
		System.out.println((5<3)&&(8<5));
		//|| (or) operator < lesser
		System.out.println("||-or operator");
		System.out.println((5<3)||(8<5));
		//! not operator
		System.out.println("!-not operator");
		System.out.println(!(5<3));
		
	}

}
