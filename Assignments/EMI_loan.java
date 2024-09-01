package demo;

import java.util.Scanner;

public class EMI_loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			// TODO Auto-generated method stub
			System.out.println("Calculte the EMI_ioan");
			int price,time,rate,n=100;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the price:");
			price=sc.nextInt();
			System.out.println("Enter the rate:");
			rate=sc.nextInt(); 
			System.out.println("Enter the time:");
			time=sc.nextInt();
			time=time*12 ;
			int loan =(price*rate*(1+rate)^time)/((1+rate)^time-1);
			System.out.println("Emi_loan :"+loan);
		
	}

}
