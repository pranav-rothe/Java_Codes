package logical;

import java.util.Scanner;

public class ReverseNumber {	
	public static void main(String[] args)
	{
		int number;
		int digit;
		int reverse=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number: " );
		number=sc.nextInt();		
		while(number!=0)
		{
			digit=number%10;
			reverse=reverse*10+digit;
			number=number/10;
		}		
		System.out.println("Reverse Number: "+reverse);
		sc.close();
	}

}
