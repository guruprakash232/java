package javatask;

class Gymmembership{
	
	String membername = "Guru";
	String membershiptype = "Basic membership";
	String Duration = "3 MONTH";
	
	public void display() {
		
		System.out.println("Member Name : " + membername + "\n MemberShip Type : " + membershiptype + "\n Duration :" + Duration);
	}
	
}

class Premiummembership extends Gymmembership{
	
	String personltariner = "YES";
	String  spaacess = "YES";
	
	int gymfess = 4500;
	
	int premiumfees = 9000;
	
	public void display1() {
		
		if (membershiptype == "Basic membership" || membershiptype == "Premium membership" ) {
			
			System.out.println("Sir your gym fees for 3 months fees under basic membership is : " + gymfess);
		}
		
		else {
			System.out.println("Sir your gym fees for 3 months under Premium membership is : "  + premiumfees);
		}
	}
}

public class GymInheritance {

	public static void main(String[] args) {
		
		Premiummembership p1 = new Premiummembership();
		p1.display();
		p1.display1();
		
	}

}