/*4. Write a Java program to check if a vowel is present in a string. Additionally, the program should count 
the total number of vowels present and display the count along with whether any vowels are present or not.
*/

import java.util.Scanner;
public class VowelsCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string  :");
		String s1=sc.nextLine();
		String s=s1.toLowerCase();
		char c[]=s.toCharArray();
		int count=0;
		for(int i=0;i<s.length();i++)
		{			
			if(c[i]=='a'|| c[i]=='e'||c[i]=='i'|| c[i]=='o'||c[i]=='u')
			{
				count++;
				System.out.print(c[i]+" ");
			}
		}
		System.out.println();
		if(count>0)
		{
		   System.out.println("Count of vowels present in String is :"+count);
		}
		else
		{
			System.out.println(" Vowels are not there in String");
		}
	}
}
