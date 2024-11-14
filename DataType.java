package javaprogram;
import java.util.*;
//PRIMITIVE DATATYPES
public class DataType {
	public static void main(String[]args) {
		Scanner obj=new Scanner(System.in);
		int a;
		System.out.println("Enter A value");
		a=obj.nextInt();
		System.out.println("The value of A :"+a);
		
		float b;
		System.out.println("Enter B value");
		b=obj.nextFloat();
		System.out.println("The value of B :"+b);
		
		
		double c;
		System.out.println("Enter C value");
		c=obj.nextDouble();
		System.out.println("The value of C :"+c);
		
		
		char d;
		System.out.println("Enter D value");
		d=obj.next().charAt(0);
		System.out.println("THe value of D :"+d);
		
		long e;
		System.out.println("Enter E value");
		e=obj.nextLong();
		System.out.println("The value of E :"+e);
		
		boolean f;
		System.out.println("Enter F value");
		f=obj.nextBoolean();
		System.out.println("The value of F :"+f);
		
		byte g;
		System.out.println("Enter G value");
		g=obj.nextByte();
		System.out.println("The value of G :"+g);
		
		short h;
		System.out.println("Enter H value");
		h=obj.nextShort();
		System.out.println("THe value of H :"+h);
		
		
	}		
		
}



