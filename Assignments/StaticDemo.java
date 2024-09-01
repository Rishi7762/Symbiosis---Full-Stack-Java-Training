package demo;

public class StaticDemo {
	private int section;//non static or instance variable
	private static int secNo;//static or class variable - called by className
	
	static {
		System.out.println("----------Within Static Block-----------");
		secNo = 100;
	}
	static void display() {
		//System.out.println("Section : "+section);
		System.out.println("Section : "+secNo);
	}
	//default constructor
	StaticDemo(){
		System.out.println("-----Within Default Constructor-----");
		secNo++;
		section++;
	}
	@Override
	public String toString() {
		return "MyClass [Serial No "+secNo+", Section= "+section+"]";
	}
	
	public static void main(String args[]) {
		StaticDemo obj1 = new StaticDemo();
		System.out.println(obj1);
		//static method with class name
		StaticDemo.display();
		StaticDemo obj2 = new StaticDemo();
		System.out.println(obj2);
		StaticDemo.display();
		StaticDemo obj3 = new StaticDemo();
		System.out.println(obj3);
		StaticDemo.display();
	}
}
