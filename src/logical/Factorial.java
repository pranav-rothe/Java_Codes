package logical;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		//int num = 5;
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		long factorial = 1;
		
		//Calculate Factorial
		for(int i=1;i<=num;i++) {
			factorial *=i;
		}
		
		System.out.println("Factorial of " +num+ " is: " +factorial);
		
		sc.close();

	}

}
