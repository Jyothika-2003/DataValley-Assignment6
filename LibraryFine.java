/*2.A library charges a fine for every book returned late. For the first 7 days, the fine is 50 paise, for 8-14 days the fine is one rupee, and above 14 days fine is 5 rupees. 
If you return the book after 21 days, your membership will be canceled. Write a program to accept the number of days the member is late to return the book and display the fine or the appropriate message.*/

import java.util.Scanner;
public class LibraryFine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the days :");
		int days=sc.nextInt();
		double fine=0;
		if(days<=7)
		{
			fine=days*0.5;
		}
		else if(days>=8 && days<=14)
		{
			fine=7*0.5+(days-7)*1;
		}
		else if(days>=15 && days<=21)
		{
			fine=7*0.5+7*1+(days-14)*5;
		}
		else
		{
			System.out.println("Due to long late your membership will be canceled.");
			System.exit(0);
		}
		System.out.println("Due to"+days+"days late your fine is "+fine);
	}

}
