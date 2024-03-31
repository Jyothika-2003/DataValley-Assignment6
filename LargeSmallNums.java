/*6.Write a Java program to enter numbers until the user wants, and at the end, the program should display the largest and smallest numbers entered. 
Additionally, the program should calculate and display the average of all the numbers entered.*/

import java.util.Scanner;
public class LargeSmallNums{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;
        char choice = 'y';
        while (choice == 'y' || choice == 'Y')
        {
            System.out.println("Enter a number : ");
            int number = scanner.nextInt();
            largest = Math.max(largest, number);
            smallest = Math.min(smallest, number);
            sum += number;
            count++;
            System.out.println("Do you want to enter another number? (y/n)");
            choice = scanner.next().charAt(0);
            System.out.println(choice);
        }
        if (count > 0) 
        {
            double average = (double) sum / count;
            System.out.println("Largest number entered: " + largest);
            System.out.println("Smallest number entered: " + smallest);
            System.out.println("Average of all numbers entered: " + average);
        }
        else 
        {
            System.out.println("No numbers were entered.");
        }
        scanner.close();
    }
}
