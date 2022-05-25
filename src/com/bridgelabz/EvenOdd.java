package com.bridgelabz;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked:");
		num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("This is even number: "+num);
		}
		else
		{
			System.out.println("This is odd number: "+num);
		}
	}

}
