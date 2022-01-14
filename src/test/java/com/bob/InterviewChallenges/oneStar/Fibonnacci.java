package com.bob.InterviewChallenges.oneStar;

import java.util.Scanner;

public class Fibonnacci {
	
	static int fib(int num) {
		//fib(3) = fib(2) + fib(1)
		//fib(1) = 1
		
		if (num <= 1) return num;
		return fib(num-1) + fib(num - 2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" The fibonacci of: ");
		int num = scanner.nextInt();
		System.out.print(" is: " + fib(num));
		scanner.close();

	}

}
