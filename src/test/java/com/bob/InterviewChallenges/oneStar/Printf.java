package com.bob.InterviewChallenges.oneStar;

import java.util.Scanner;

public class Printf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		int x1 = scanner.nextInt();
		String s2 = scanner.next();
		int x2 = scanner.nextInt();
		String s3 = scanner.next();
		int x3 = scanner.nextInt();
		scanner.close();
		
		System.out.println("================================");
			System.out.printf("%-15s%03d %n", s1, x1);
			System.out.printf("%-15s%03d %n", s2, x2);
			System.out.printf("%-15s%03d %n", s3, x3);
		System.out.println("================================");

	}

}
