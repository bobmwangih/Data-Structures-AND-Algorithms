package com.bob.InterviewChallenges;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FetchItemsToDisplay {

	static List<String> result(List<ArrayList<String>> items, int sortParam, int sortOrder, int no_of_items) {
		List<String> fetchedItems = new ArrayList<String>();

		switch (sortParam) {
		case 0:
			if (sortOrder == 0) {
				Collections.sort(items, (a, b) -> a.get(0).compareTo(b.get(0)));
				for (int i = 0; i < no_of_items; i++) {
					fetchedItems.add(items.get(i).get(0));
				}
			} else {
				Collections.sort(items, (a, b) -> b.get(0).compareTo(a.get(0)));
				for (int i = 0; i < no_of_items; i++) {
					fetchedItems.add(items.get(i).get(0));
				}
			}
			break;

		case 1:
			if (sortOrder == 0) {
				Collections.sort(items, (a, b) -> Integer.parseInt(a.get(1)) - Integer.parseInt(b.get(1)));
				for (int i = 0; i < no_of_items; i++) {
					fetchedItems.add(items.get(i).get(0));
				}
			} else {
				Collections.sort(items, (a, b) -> Integer.parseInt(b.get(1)) - Integer.parseInt(a.get(1)));
				for (int i = 0; i < no_of_items; i++) {
					fetchedItems.add(items.get(i).get(0));
				}
			}
			break;

		case 2:
			if (sortOrder == 0) {
				Collections.sort(items, (a, b) -> Integer.parseInt(a.get(2)) - Integer.parseInt(b.get(2)));
				for (int i = 0; i < no_of_items; i++) {
					fetchedItems.add(items.get(i).get(0));
				}
			} else {
				Collections.sort(items, (a, b) -> Integer.parseInt(b.get(2)) - Integer.parseInt(a.get(2)));
				for (int i = 0; i < no_of_items; i++) {
					fetchedItems.add(items.get(i).get(0));
				}
			}
			break;
		}
		return fetchedItems;

	}

	public static void main(String[] args) {
		List<ArrayList<String>> list1 = new ArrayList<ArrayList<String>>();
		list1.add(new ArrayList<String>(Arrays.asList("zep", "10", "15")));
		list1.add(new ArrayList<String>(Arrays.asList("item2", "3", "4")));
		list1.add(new ArrayList<String>(Arrays.asList("item3", "17", "8")));

		List<String> fetchedItems = result(list1, 1, 0, 2);
		out.println("Before Sort " + list1);
		out.println("After Sort " + fetchedItems);

	}

}
