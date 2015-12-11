package com.personal;

public class ToAnalyse {
	
	public int RandomMethod(String pattern, String source){
	int counter=0;
	int patternLength = pattern.length();
	int sourceLength = source.length();
	//System.out.println(sourceLength + "  "+patternLength);
	
	
	 for (int i = 0; i <= sourceLength - patternLength; i++)
	
	 {
	        int j;
	  
	        /* For current index i, check for pattern match */
	        for (j = 0; j < patternLength; j++)
	            if (source.charAt(i+j) != pattern.charAt(j))
	                break;
	 
	        if (j == patternLength)
		          System.out.println("Index : "+ i);
	    }
	
	//for(int i =0 ; i<=(sourceLength-patternLength);i++){
//		System.out.println(source.substring(i,patternLength+i) );
		//if ((source.substring(i,patternLength+i)).contentEquals(pattern)){
			//counter ++;
		//	System.out.println("yes");
	//	}			
	//}


	return counter;

}
}
