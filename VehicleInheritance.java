package javatask;

import java.util.*;

class Vehicle{
	
	public String make;
	
	public String model ;
	
	public int year ;
	
	Vehicle(String make,String model, int year){
		
		 this.make = make;
		 this.model = model;
		this.year = year;
		
		
	}
	
	public void  display() {
		
		System.out.println("makers of car :"+ make +"\n model : "+ model + "\n year : " + year);
	}
			
}


 class car extends Vehicle{
	
	public int trunksize;
	
 car(String make,String model, int year ,int trunksize){
	
	super(make, model, year);
	
this.trunksize = trunksize;
	
	
}
 
 public void display1() {
	 
	System.out.println("trunk size : " + trunksize); 
		 
	 }
 }
	 
	 
 class truk extends car{

int payloadcapacity ;

truk(String make,String model, int year ,int trunksize,int payloadcapacity){
	
	super(make, model, year, trunksize);
	
	this. payloadcapacity = payloadcapacity;
	
	
}
	 
public void display2() {
	
	System.out.println("payload capacity : " + payloadcapacity);
}
 }
public class VehicleInheritance {

	

	public static void main(String[] args) {
		
		truk t1 = new truk ("BMW","S6",2024,500,10000 );
		
		car c1 = new car ("benz", "s22",2023,450);
		c1.display();
		c1.display1();
		
		t1.display();
		t1.display1();
		t1.display2();
		
		
	}



}