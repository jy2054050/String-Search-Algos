package com.personal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadInputFile {
	// Method to read the string from the input file 
	public String FileReadMethod(String location){
		BufferedReader br = null;
		String result="";
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader(location));
			
			while ((sCurrentLine = br.readLine()) != null) {
				result=sCurrentLine;
			}
		}catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (br != null)br.close();
			} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		return result;
		}
}
