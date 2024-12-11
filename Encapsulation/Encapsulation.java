
/*The Class Encapsulate is encapsulated as the variables are declared Private, 
 The Get methods like get Name , age and RollNo  are set as public these methods are used to access 
 these variables And The setter methods like Set Name, age and RollNo are set as public methods and are used 
  to set values to these variables
 */
package javatask;

class Encapsulate{

	private String name;
	private int age, rollNo;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getRoll() {
		return rollNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setRoll(int rollNo) {
		this.rollNo = rollNo;
	}
	
}

public class Encapsulation { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulate student1 = new Encapsulate();
		student1.setName("Guru");
		student1.setAge(25);
		student1.setRoll(113);
		
		Encapsulate student2 = new Encapsulate();
		student2.setName("Naveen");
		student2.setAge(23);
		student2.setRoll(114);
		
		System.out.println("Student Name : "+student1.getName()+", Roll No : "+student1.getRoll()+", Age : "+student1.getAge());
		System.out.println("Student Name : "+student2.getName()+", Roll No : "+student2.getRoll()+", Age : "+student2.getAge());
		
	}

}
