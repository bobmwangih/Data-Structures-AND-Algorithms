package com.bob.InterviewChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomSortedArray {

	public static int moves(List<Integer> arr) {
		int count = 0;
		int j = arr.size() - 1;
		int i = 0;
		while (i < j) {

			if (arr.get(i) % 2 == 0) {
				i++;
				continue;
			}

			if (arr.get(j) % 2 != 0) {
				j--;
				continue;
			}

			int elementLeft = arr.get(i);
			if (elementLeft % 2 != 0) {
				arr.set(i, arr.get(j));
				arr.set(j, elementLeft);
				count++;
				i++;
				j--;
			}
			// System.out.println(Arrays.toString(arr.toArray()));
		}

		return count;
	}

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(4, 13, 10, 21, 20));

		System.out.println(moves(arr));
	}
}
