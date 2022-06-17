package com.bob.InterviewChallenges;



/*Have the function NumberSearch(str) take the str parameter, search for all the numbers in the string, add them together, then return that final number divided by the total amount of letters in the string. For example: if str is "Hello6 9World 2, Nic8e D7ay!" the output should be 2. First if you add up all the numbers, 6 + 9 + 2 + 8 + 7 you get 32. Then there are 17 letters in the string. 32 / 17 = 1.882, and the final answer should be rounded to the nearest whole number, so the answer is 2. Only single digit numbers separated by spaces will be used throughout the whole string (So this won't ever be the case: hello44444 world). Each string will also have at least one letter.
*/

import java.util.*;
import java.io.*;

public class Digits {

	public static String NumberSearch(String str) {
		    // code goes here  
		    List<Character> chars = new ArrayList<>();
		    List<Character> vals = new ArrayList<>();
		    List<Integer> sum = new ArrayList<Integer>();

		    for (char ch : str.toCharArray()){
		      if(Character.isDigit(ch)){
		        vals.add( ch);
		      }else{
		        chars.add(ch);
		       
		      }
		    }
		    vals.forEach(val -> {
		    	//sum.add(0, sum.get(0)+ Character.getNumericValue(val));
		    	System.out.println(val);
		    });
		    
		    Integer len = chars.size();

		    double res = Math.round((double)sum.get(0)/(double)len);
		    return String.format("%d", (int)res);
		   // return "";
		  }

	public static void main(String[] args) {
		// keep this function call here
		System.out.print(NumberSearch("H3ello9-9"));
		
	}

}
