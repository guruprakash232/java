//write a program to print even numbers and odd numbers seperately using if


package javatask;

public class OddEven {

	    public static void main(String[] args) 
	    {
	        System.out.println("EVEN NUMBERS:");
	        for (int i = 1; i <= 10; i++) {             
	            if (i % 2 == 0) {                       
	                System.out.println(i+" IS EVEN NUMBER");
	            }
	        }

	        System.out.println("ODD NUMBERS:");
	        for (int i = 1; i <= 10; i++) {              
	            if (i % 2 != 0) {                    
	                System.out.println(i+" IS ODD NUMBER");
	            }
	        }
	    }
	

}