package hw7;

import java.util.Scanner;
//babylon method
public class findSquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number: ");  
		Scanner scan = new Scanner(System.in);  
		double num = scan.nextDouble();  
		System.out.println("The square root of "+ num+ " is: "+squareRoot(num));  
		}  
		
		public static double squareRoot(double num)   
		{   
		double x;  
		double sqrtroot=num/2;  
		do   
		{  
		x=sqrtroot;  
		sqrtroot=(x+(num/x))/2;  
		}   
		while((x-sqrtroot)!= 0);  
		return sqrtroot;  
	}

}
//O(n)