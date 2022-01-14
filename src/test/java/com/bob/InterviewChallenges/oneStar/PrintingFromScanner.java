package com.bob.InterviewChallenges.oneStar;

import java.util.Scanner;

public class PrintingFromScanner {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		    int num = scanner.nextInt();
		    double dub = scanner.nextDouble();
		    scanner.nextLine();
		    String str = scanner.nextLine();
		    scanner.close();
		    
		    System.out.println("String: " + str);
		    System.out.println("Double: " + dub);
		    System.out.println("Int: " + num);

	}

}
