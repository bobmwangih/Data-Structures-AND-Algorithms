package com.bob.InterviewChallenges;

import java.util.*;
import java.io.*;
import java.net.*;

public class Reading {

	public static void main (String[] args) { 
		    System.setProperty("http.agent", "Chrome");
		    try { 
		      URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
		      try {
		        URLConnection connection = url.openConnection();
		        InputStream inputStream = connection.getInputStream();
		        int ch;
		        
		        StringBuilder sb = new StringBuilder();   
		        while(((ch = inputStream.read() )!= -1)) {
		        	sb.append((char) ch);
		        }
		        String data = sb.toString();
		        
		        int count = 0;
		        for (String part : data.split(",")) {
		            String[] subparts = part.split("=", 2);
		        	System.out.println(subparts);
		            if ("age".equals(subparts[0]) && Integer.valueOf(subparts[1]) > 50) {
		                count++;
		            }
		        }
		        System.out.print(count);
		        
		      } catch (IOException ioEx) {
		        System.out.println(ioEx);
		      }
		    } catch (MalformedURLException malEx) {
		      System.out.println(malEx);
		    }
		  }
}
