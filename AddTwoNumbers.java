import java.util.Scanner;
public class AddTwoNumbers{
	public static void main (String[] args){
		
		float num1;
		float num2;
		float sum;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = sc.nextFloat();
		System.out.println("Enter Second number");
		num2 = sc.nextFloat();
		
		sum = num1 + num2;
		
		System.out.println("Sum of two number : " + sum);
		
	}
	
}