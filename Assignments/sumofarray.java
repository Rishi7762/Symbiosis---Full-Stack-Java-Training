package demo;
import java.util.*;
public class sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		num= sc.nextInt();
		int[] arr=new int[num];
		System.out.println("Enter the elements :");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
			sum += arr[i];
		}
		System.out.println("The sum of array element is :"+sum);
		
	}

}
