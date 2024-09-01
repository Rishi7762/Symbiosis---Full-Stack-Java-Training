package demo;
import java.util.*;
public class Reminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("REMINDER");
		int divident,divisor;
		//Accept two values
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Divident value:");
		divident = sc.nextInt();
		System.out.println("Enter the Divisor value:");
		divisor = sc.nextInt();
		//Calculate the Quotient
		int quotient = divident/divisor;
		System.out.println("Quotient is "+quotient);
		//calulate the remainder
		int remainder = divident - (divisor * quotient);
		System.out.println("Remainder is :"+remainder);
		
	}

}
