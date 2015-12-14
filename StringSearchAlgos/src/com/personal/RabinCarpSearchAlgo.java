package com.personal;


public class RabinCarpSearchAlgo {

	public int rabinCarpStringSearchMethod(String pattern, String source){
		int patternLength = pattern.length();
		int sourceLength = source.length();
		int patternHashValue= getHashCodeofString(pattern);
		int counter=0;
		for (int i=0;i<(sourceLength-patternLength);i++){
			String sourceSubString= source.substring(i,i+patternLength);
			
			int subStrinHashValue = getHashCodeofString(sourceSubString);
			if (subStrinHashValue==patternHashValue){
				if(pattern.contentEquals(sourceSubString)){
					counter++;
				}
			}
			
		}	
		//System.out.println(counter);
		return counter;
		
	}
	
	public int getHashCodeofString(String str){
		return str.hashCode();
	}
	
}