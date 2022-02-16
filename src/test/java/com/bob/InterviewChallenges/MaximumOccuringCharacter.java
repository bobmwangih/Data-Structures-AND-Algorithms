package com.bob.InterviewChallenges;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaximumOccuringCharacter {

	static char result(String message) {
		Map<Character, Integer> counter = new HashMap<Character, Integer>();

		for (int i = 0; i < message.length(); i++) {
			char candidate = message.charAt(i);
			if (counter.containsKey(candidate)) {
				counter.put(candidate, counter.get(candidate) + 1);
				continue;
			}
			counter.put(candidate, 1);
		}
		int max = Collections.max(counter.values());
		List<Character> maxKeys = new ArrayList<Character>();

		maxKeys = counter.entrySet().stream().filter(entry -> entry.getValue() == max).map(entry -> entry.getKey())
				.collect(Collectors.toList());
		
		if (maxKeys.size() > 1) {
			List<Integer> firstValueChecker = new ArrayList<Integer>();
			maxKeys.forEach(ch -> firstValueChecker.add(message.indexOf(ch)));
			return message.charAt(Collections.min(firstValueChecker));
		}
		return maxKeys.get(0);
	}

	public static void main(String[] args) {
		System.out.println(result("bbbdddddddddaaccBaaaaaadcccbddddddaaaaaaaa"));

	}

}
