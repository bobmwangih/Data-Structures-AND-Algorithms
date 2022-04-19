package com.bob.InterviewChallenges;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoStrings {
	static void commonSubstring(List<String> a, List<String> b) {
		for (String str : a) {
			twoStrings(str, b.get(a.indexOf(str)));
		}
	}

	static void twoStrings(String s1, String s2) {
		Set<Character> set1 = new HashSet<Character>();

		for (char s : s1.toCharArray()) {
			set1.add(s);
		}
		int len = s2.length();
		for (int i = 0; i < len; i++) {
			if (set1.contains(s2.charAt(i))) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>(2);
		a.add("hello");
		a.add("hi");
		ArrayList<String> b = new ArrayList<String>(2);
		b.add("world");
		b.add("bye");
		commonSubstring(a, b);
	}

}
