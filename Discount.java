/*3.While purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 50. 
If the quantity purchased is between 25 and 50 (inclusive), a discount of 5% is offered. If the quantity purchased is less than 25, no discount is offered.
Write a program to calculate the total expenses given the quantity and price per item entered through the keyboard.
*/

import java.util.Scanner;
public class Discount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Quantity : ");
		int quantity=sc.nextInt();
		System.out.println("Enter price per item : ");
		double price=sc.nextDouble();
		double total=0;
		if(quantity>50)
		{
			total=quantity*(price-(price*10)/100);
		}
		else if(quantity>=25 && quantity<=50)
		{
			total=quantity*(price-(price*5)/100);
		}
		else
		{
			total=quantity*price;
			System.out.println("No discount is offered");
		}
		System.out.println("Total expenses for given quantity and price : "+total);
	}
}
