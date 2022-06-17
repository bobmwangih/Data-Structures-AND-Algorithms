package com.bob.Datastructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Dubs {

	static int dubbies(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int e : nums) {
			if (set.contains(e)) {
				return e;
			}
			set.add(e);
		}
		return -1;

	}

	static String errors(int[] nums, int duplicate) {
		List<Integer> numbers = Arrays.stream(nums).boxed().collect(Collectors.toList());
		int err = numbers.lastIndexOf(duplicate) + 1;
		return "[ " + duplicate + "," + err + " ]";

	}

	public static void main(String[] args) {
		// int[] nums = { 1, 2, 3, 4, 3 };
		int[] nums = { 1, 2, 2 };

		int duplicate = dubbies(nums);
		if (duplicate != -1)
			System.out.println(errors(nums, duplicate));
	}
}
