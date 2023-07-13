//Write a program to accept a no from the user and display the multiplication table

package lab_thursday;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
// declaration of variable 
	int num,res;
	
//Taking input from user
	System.out.println("Enter a number");
     num=sc.nextInt();
     
     
 //Using for loop
     for (int i=1;i<=10;i++){
    	 res=num*i;    //multiplying user input to i
    	 System.out.println(num+"*"+i+"="+res);
    	 
     }
	}
}

