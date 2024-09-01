package demo;
import java.util.*;

public class stud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Arithmatic Calculation");
			int num1,num2;
			Scanner sc= new Scanner(System.in);
			num1=sc.nextInt();
			num2=sc.nextInt();
			int sum = num1+num2;
			System.out.println("Addition is :"+sum);
			int sub = num1-num2;
			System.out.println("substraction is :"+sub);
			int div = num1/num2;
			System.out.println("Division is :"+div);
			int mul = num1*num2;
			System.out.println("Multipication is :"+mul);
			int mod = num1%num2;
			System.out.println("Remander is :"+mod);
			

	}

}
