package com.personal;

public class StringSearchMainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String pattern = "upload";
		
		String location= "C:/Users/jyadav/git/String-Search-Algos/StringSearchAlgos/resources/new_log.txt";
		ReadInputFile readIn = new ReadInputFile();
		String source= readIn.FileReadMethod(location);
		//System.out.println("The string is "+result);
	System.out.println("String's length "+source.length());
		
		NaiveSearch naiveSearch = new NaiveSearch();
		int noOfOccurance =	naiveSearch.NaiveSearchMethod(pattern, source);
				
		System.out.println("Naive Search Result :"+noOfOccurance);
		
		ToAnalyse n = new ToAnalyse();
		int numberOfOccurance = n.RandomMethod(pattern, source);
		System.out.println("To test Method Result :"+numberOfOccurance);
		
		RabinKarpSearchAlgo rc= new RabinKarpSearchAlgo();
		int rcOccurance = rc.rabinKarpStringSearchMethod(pattern, source);
		System.out.println("Rabi-Karp Method Result :"+ rcOccurance);
		
	}

}
