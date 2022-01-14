package com.bob.InterviewChallenges.oneStar;

import java.util.Arrays;
import java.util.stream.IntStream;
import static java.lang.System.*;

public class Incrementer {

	static int[] worker(int[] arr) {
		if(arr.length == 0) return arr;
		int[] arr2 = new int[arr.length];
		IntStream.range(0, arr.length).forEach(index -> {
			int sum = arr[index] + (index + 1);
			String temp = String.valueOf(sum);
			if (temp.length() > 1) {
				arr2[index] = Integer.parseInt(temp.substring(temp.length() - 1));
				return;
			}
			arr2[index] = sum;
		});
		return arr2;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {9,7,9};
		
		out.println(Arrays.toString(worker(arr)));
		out.println(Arrays.toString(Kata.incrementer(arr)));

	}

}


interface Kata {
  static int[] incrementer(int[] n) {
    return IntStream.range(0, n.length).map(i -> (n[i] + i + 1) % 10).toArray();
  }
}
