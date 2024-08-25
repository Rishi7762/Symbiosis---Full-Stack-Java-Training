import java.util.*;
class Remainder{
    public static void main(String[] args){
    int dividend ,divisor;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter dividend: ");
    dividend = sc.nextInt();
			
    System.out.println("Enter divisor: ");
    divisor = sc.nextInt();
			
    if(divisor<=0)
        System.out.println("Cannot divide by zero");
			
    while(dividend >= divisor){
        dividend  -= divisor;
    }
			
    int remainder = dividend;
    System.out.println("The Remainder is: "+remainder);
    }
}
