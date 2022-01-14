package com.bob.InterviewChallenges.oneStar;

import java.util.Scanner;

public class PhoneNumberchecker {

	static String checker(String s) {
		return s.length() == 10 ? "Ten digits" : "Not compliant " +s.length() + " digits";
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter phone number: ");
		String s = scanner.nextLine();
		System.out.print(checker(s));
		scanner.close();

	}

}
