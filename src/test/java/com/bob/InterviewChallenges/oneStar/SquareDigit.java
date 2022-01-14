package com.bob.InterviewChallenges.oneStar;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SquareDigit {

	static int worker(int n) {
		String s = String.valueOf(n);
		// TODO Implement me
		char[] arr1 = s.toCharArray();
		int[] arr2 = new int[arr1.length];
		IntStream.range(0, arr1.length).forEach(index -> {
			int x = Integer.parseInt(String.valueOf(arr1[index]));
			arr2[index] = x * x;
		});
		String joined = Arrays.stream(arr2).mapToObj(String::valueOf).collect(Collectors.joining(""));
		return Integer.parseInt(joined);
	}

	public static void main (String[] args) {
		System.out.println(worker(9119));

	}

}
