package com.personal;

public class StringSearchMainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String location= "C:/Users/jyadav/git/String-Search-Algos/StringSearchAlgos/resources/inputFile.properties";
		ReadInputFile readIn = new ReadInputFile();
		String result= readIn.FileReadMethod(location);
		System.out.println("The string is "+result);
		System.out.println("String's length "+result.length());
	}

}
