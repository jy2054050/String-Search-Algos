package com.personal;

public class NaiveSearch {
	
	public int NaiveSearchResult(String pattern, String source){
			int occured=0;
			int patternLength = pattern.length();
			int sourceLength = source.length();
			//System.out.println(sourceLength + "  "+patternLength);
			for (int i = 0; i <= sourceLength - patternLength +1; i++){
			        int j;
			        /* For current index i, check for pattern match */
			        for (j = 0; j < patternLength; j++)
			            if (source.charAt(i+j) != pattern.charAt(j))
			                break;
			 
			        if (j == patternLength) {
			        //	System.out.println("Index : "+ i +" String is :"+ source.charAt(i-1) + source.charAt(i)+source.charAt(i+1));
			        	occured++;
			        }
			      
			    }
			 //System.out.println("asda " +occured);
			return occured;
			}
	}
