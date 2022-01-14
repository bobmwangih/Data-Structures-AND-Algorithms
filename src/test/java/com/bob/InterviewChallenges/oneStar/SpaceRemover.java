package com.bob.InterviewChallenges.oneStar;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SpaceRemover {
	
	static String spaceRemover(String s) {
		return s.replaceAll("\\s", "");
	}
	
	static String methodTwo(String s) {
		char[] original = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		IntStream.range(0, original.length).forEach(index->{
			if(original[index] !=' ' && original[index] != '\t') {
				sb.append(original[index]);
			}
		});
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String s = scanner.nextLine();
//		System.out.print(spaceRemover(s));
		System.out.print(methodTwo(s));
		scanner.close();

	}

}
