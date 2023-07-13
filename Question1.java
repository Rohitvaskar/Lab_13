//Write a program to accept radius from the user and find out area of circle and circumstances of circle

package lab_thursday;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args)
		{
			//creating variable
			int rad;
			
			//Defining pi value
			float pi =3.14f;
			
			//taking input from the user
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter radius of circle");
			 rad=sc.nextInt();
			 
			 // formula of area of circle= area=pi*(rad*rad)
			 float area =pi*rad*rad;
			System.out.println("Area of circle = "+area);
			
			// cicumference of c
			float circum = 2*pi*rad;
			System.out.println("circumference of a circle =" +circum);

	}

}
