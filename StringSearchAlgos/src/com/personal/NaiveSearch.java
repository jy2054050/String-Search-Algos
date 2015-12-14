package com.personal;

public class NaiveSearch {
	// Complexity O(n^2)
	public int NaiveSearchMethod(String pattern, String source){
			int occured=0;
			int patternLength = pattern.length();
			int sourceLength = source.length();
			
			for (int i = 0; i <= sourceLength - patternLength; i++){
			        int j;
			        for (j = 0; j < patternLength; j++)
			            if (source.charAt(i+j) != pattern.charAt(j))
			                break;
			 
			        if (j == patternLength) {
			        	occured++;
			       }
			    }
			return occured;
			}
	}