package com.bob.Datastructures.Recursion;

public class Recursion {
	
	public static int recursion(int num) {
		//factorial
		//3 = 3 * 2!
		//num! = num * (num-1)!
		
		if (num == 0) {
			return 1;
		}
		return num * recursion(num-1);
	}

}
