package com.bob.InterviewChallenges.oneStar;

import java.util.Scanner;

public class Factorial {
	
	static int fact(int num) {
		//num! = num * (num-1)!
		//0! = 1
		
		if (num == 0) return 1;
		return num * fact(num - 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" The factorial of: ");
		int num = scanner.nextInt();
		System.out.print(" is: " + fact(num));
		scanner.close();

	}

}
