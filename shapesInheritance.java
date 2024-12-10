package javatask;

abstract class Shape
{
	float r,a,b,c,d,l,w,h;
	float pi=3.14f;	
	  abstract void calculating();
	 
}

	 class Circl extends Shape
	 {
		   void calculating()
		 {
			   r=12;
			 System.out.println("This radious of Circle:"+(pi*r*r));
			 System.out.println("This perimeter of Circle:"+(2*pi*r));
			   }
			
			 
		 }
	  class Rectangle extends Shape
	 {
		 void calculating()
		 
		 {
			 l=3.4f;
			 w=5.5f;
			 
			 System.out.println("This Area of Rectangle:"+(l*w));
			 System.out.println("This perimeter of Rectangle:"+((l*w)*2));
			
			 
		 }
		 
	 }
 class Triangle extends Shape
	 {
		 void calculating()
		 {
			 a=3;b=4;c=5;
			 h=5;
			 System.out.println("This Area of Triangle:"+(a+b+c));
			 System.out.println("This perimeter of Triangle:"+((h*b)/2));
			
			 
		 }
		 
	 }
	 public class shapesInheritance{

	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.calculating();
		Circl c=new Circl();
		c.calculating();
		Rectangle r=new Rectangle();
		r.calculating();
				
	

	}

}