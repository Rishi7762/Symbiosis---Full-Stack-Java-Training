package demo;
import java.util.*;
public class Check_alph {

	public static void main(String[] args) {
		char alph;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Alphabet you wount to check");
		alph = sc.nextLine().charAt(0);
		if(alph =='a'|| alph=='e'|| alph=='i'|| alph=='o'|| alph=='u'|| alph=='A'|| alph=='E'|| alph=='I'|| alph=='U')
		{
			System.out.println("Vowal :"+alph);
		}
		else {
			System.out.println("Consonants :"+alph);
		}
		
	}

}
