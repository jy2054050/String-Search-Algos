package com.personal;

public class NaiveSearch {
	
	public int NaiveSearchResult(String pattern, String source){
		int counter=0;
		int patternLength = pattern.length();
		int sourceLength = source.length();
		System.out.println(sourceLength + "  "+patternLength);
		for(int i =0 ; i<=(sourceLength-patternLength);i++){
			System.out.println(source.substring(i,patternLength+i) );
			if ((source.substring(i,patternLength+i)).contentEquals(pattern)){
				counter ++;
				System.out.println("yes");
			}			
		}
	
	
		return counter;
	}
}
