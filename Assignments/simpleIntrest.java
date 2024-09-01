package demo;
import java.util.*;
public class simpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculte the simple intrest");
		int price,time,rate;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price:");
		price=sc.nextInt();
		System.out.println("Enter the rate:");
		rate=sc.nextInt(); 
		System.out.println("Enter the time:");
		time=sc.nextInt();
		float intrest = (price*rate*time)/100;
		System.out.println("Simple intrest :"+intrest);
	}

}
