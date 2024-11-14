package javaprogram;
import java.util.*;
public class UserInput {
    public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    int a,b,c;
	    System.out.println("Enter A value");
	    a=obj.nextInt();
	    System.out.println("Enter B value");
	    b=obj.nextInt();
	    c=a+b;
	    System.out.println("The Addition value of c :"+c);
	
	    System.out.println("Enter A value");
	    a=obj.nextInt();
	    System.out.println("Enter B value");
	    b=obj.nextInt();
	    c=a-b;
	    System.out.println("The Subtraction value of c :"+c);
	
	    System.out.println("Enter A value");
	    a=obj.nextInt();
	    System.out.println("Enter B value");
	    b=obj.nextInt();
	    c=a*b;
	    System.out.println("The Multiplication value of c :"+c);
	
	   System.out.println("Enter A value");
	   a=obj.nextInt();
	   System.out.println("Enter B value");
	   b=obj.nextInt();
	   c=a/b;
	   System.out.println("The Division value of c :"+c);
	
	   System.out.println("Enter A value");
	   a=obj.nextInt();
	   System.out.println("Enter B value");
	   b=obj.nextInt();
	   c=a%b;
	   System.out.println("The Modulo value of c :"+c);
}
}
  