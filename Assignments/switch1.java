package demo;

import java.util.*;

public class switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alph;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Alphabet you wount to check");
		alph = sc.nextLine().charAt(0);
		switch (alph)
		{
		case 'a':System.out.println("Vowel");
		break;
		case 'e':System.out.println("Vowel");
		break;
		case 'i':System.out.println("Vowel");
		break;
		case 'o':System.out.println("Vowel");
		break;
		case 'u':System.out.println("Vowel");
		break;
		
		}
	}

}
