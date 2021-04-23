package practice.testing;

import java.util.Scanner;

public class FactorialOfaNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to get factorial of it");
		int num= s.nextInt();
		int fact = result(num);
		System.out.println("Factorial of the number is "+fact);
				
	}
	public static  int result(int num) {
		int fact = 1;
		for (int i = num;i>0;i--) {
			fact=fact*i;
			
			
		}
		return fact;
	}

}
