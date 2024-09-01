package demo;
import java.util.*;
public class Employee {
	int personId,age;String personName;
	
	Employee(int personId,int age,String personName){
		this.personId = personId;
		this.age = age;
		this.personName = personName;
	}
	
	public void display() {
		System.out.println("Person Id is : "+personId);
		System.out.println("Person age is : "+age);
		System.out.println("Person Name is : "+personName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp[] = new Employee[4];
		int id,age;String name;
		Scanner sc = new Scanner(System.in);
		
		//input for person
		for(int i = 0;i<emp.length;i++) {
			System.out.println("Enter person id: ");
			id = sc.nextInt();
			System.out.println("Enter person age: ");
			age = sc.nextInt();
			System.out.println("Enter person name: ");
			name=sc.next();
			emp[i] = new Employee(id,age,name);
		}
		//displaying
		for(Employee i:emp) {
			i.display();
		}
	}
}
