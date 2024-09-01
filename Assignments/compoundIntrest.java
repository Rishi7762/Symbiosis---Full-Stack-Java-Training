package demo;

import java.util.*;

public class compoundIntrest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculte the Compund intrest");
		int price,time,rate,n=100;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price:");
		price=sc.nextInt();
		System.out.println("Enter the rate:");
		rate=sc.nextInt(); 
		System.out.println("Enter the time:");
		time=sc.nextInt();
		//time=time*12;
		float compound=price*(1+rate/n)^time;
		System.out.println("compound intrest :"+compound);
	}
}
