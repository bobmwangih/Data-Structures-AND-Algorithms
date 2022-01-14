package com.bob.InterviewChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import static java.lang.System.*;

/*Given a square grid of characters in the range ascii[a-z],rearrange elements of each row alphabetically,
 * ascending.Determine if the columns are also in ascending alphabetical order,
 * top to bottom.Return YES if they are or NO if they are not.
*/
public class GridChallenge {

	static String sorter(String s) {
		char tempArray[] = s.toCharArray();
		Arrays.sort(tempArray);
		return new String(tempArray);
	}

	static String gridChallenge(List<String> grid) {
		String[] s = grid.stream().toArray(String[]::new);

		IntStream.range(0, s.length).forEach(index -> {
			// out.println(index);
			s[index] = sorter(s[index]);
			// out.println(s[index]);
		});
		// out.println(Arrays.toString(s));

		List<String> checker = new ArrayList<String>();
		checker.add("YES");
		IntStream.range(0, s.length - 1).forEach(index -> {
			String str1 = s[index];
			String str2 = s[index + 1];
			IntStream.range(1, str1.length() - 1).forEach(val -> {
				boolean b = true;
				if (str1.charAt(val) > str2.charAt(val)) {
					b = false;
					checker.set(0, "NO");
				}
				if (!b)
					return;
			});
			if (checker.get(0) == "NO")
				return;
		});

		return checker.get(0);

	}

	public static void main(String[] args) {
		List<String> testCase = new ArrayList<String>();
		testCase.add("zx");
		testCase.add("fw");

		out.println(gridChallenge(testCase));

	}

}
