package javatask;

class person1
{
	String name;
	int age;
	//constructor
	public person1(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println("Name: "+name+"\n"+"Age :"+age);
	}
}
class Person2 extends person1
{
	//constructor
public Person2(String name,int age)
{
	 super( name,age);
      super.display();
}
}
class Person3 extends person1
{
	//constructor
public Person3(String name,int age)
{
	 super( name,age);
      super.display();
}
}
public class InheritanceTask5 {

	public static void main(String[] args) {
Person2 p1=new Person2("guru",18);
Person3 p2=new Person3("mallesh",18);

		
		

	}

}