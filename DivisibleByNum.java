/*5.Write a Java program to check whether a given number is divisible by 7 and 13 simultaneously. 
Additionally, if the number is divisible by both 7 and 13, the program should display the quotient and remainder when the number is divided by 7 and 13.*/

import java.util.Scanner;
public class DivisibleByNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		if(n%7==0 && n%13==0)
		{
			System.out.println("The quotient when the number is divided by 7 :"+n/7);
			System.out.println("The remainder when the number is divided by 7 :"+n%7);
			System.out.println("The quotient when the number is divided by 13 :"+n/13);
			System.out.println("The remainder when the number is divided by 13 :"+n%13);
		}
		else
		{
			System.out.println("The number is not divisible by both 7 and 13 simultaneously.");
		}
	}
}
