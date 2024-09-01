package demo;
import java.util.*;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String city[][] = new String [2][2];

		for(int i =0;i<city.length;i++) {
			for(int j =0;j<city.length;j++) {
				if(j == 0) {
					System.out.println("Enter name of state: ");
					city[i][j] = sc.next();
				}
				else {
					System.out.println("Enter city name: ");
					city[i][j] = sc.next();
				}
			}
		}
		System.out.println("Now displaying state names and its cities.");
		for(int i =0;i<city.length;i++) {
			for(int j =0;j<city.length;j++) {
				if(j==1) {
					System.out.print(": ");
				}
			System.out.print(city[i][j]+" ");
		}
		System.out.println();
		}
	}
}
