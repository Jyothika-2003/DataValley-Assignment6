/*Write a Java program where the current year and the year in which an employee joined the organization are entered through the keyboard. 
If the number of years for which the employee has served the organization is greater than 5, a bonus of Rs. 5000/- is given to the employee. 
If the years of service are between 3 and 5 (inclusive), a bonus of Rs. 3000/- is given. 
If the years of service are less than 3, then the program should print a message indicating that no bonus is awarded.*/


import java.util.Scanner;
public class EmployeeBonus {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year of Employee joined");
		int joined_year=sc.nextInt();
		System.out.println("Enter current year");
		int current_year=sc.nextInt();
		int d=current_year-joined_year;
		if(d>5)
		{
			System.out.println("Bonus of Employee is"+5000);
		}
		else if(d>=3 && d<=5)
		{
			System.out.println("Bonus of Employee is"+3000);
		}
		else
		{
			System.out.println("No Bonus of Employee is awarded");
		}

	}

}
