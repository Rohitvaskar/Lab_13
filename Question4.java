//Write a program to accept a no from the user and find out the factorial

package lab_thursday;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// Declaration of variable
		   int num,fact=1;
		   Scanner sc=new Scanner(System.in);
		   
		//Taking input from user
			System.out.println("Enter a number");
			num=sc.nextInt();
				while(num>=1)
				{
					fact=fact*num;  //factorial formula 
					num--;
				}
				System.out.println("The factorial is="+fact);
			}

		

	}


