package com.personal;

public class StringSearchMainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String pattern = "aa";
		
		String location= "C:/Users/jyadav/git/String-Search-Algos/StringSearchAlgos/resources/inputFile.properties";
		ReadInputFile readIn = new ReadInputFile();
		String source= readIn.FileReadMethod(location);
		//System.out.println("The string is "+result);
	//	System.out.println("String's length "+source.length());
		
		NaiveSearch naiveSearch = new NaiveSearch();
		int noOfOccurance =	naiveSearch.NaiveSearchMethod(pattern, source);
				
		System.out.println("Naive Search Result :"+noOfOccurance);
		
		ToAnalyse n = new ToAnalyse();
		int numberOfOccurance = n.RandomMethod(pattern, source);
		System.out.println("To test Method Result :"+numberOfOccurance);
		
		RabinCarpSearchAlgo rc= new RabinCarpSearchAlgo();
		int rcOccurance = rc.rabinCarpStringSearchMethod(pattern, source);
		System.out.println("Rabi Carp Method Result :"+ rcOccurance);
		
	}

}
