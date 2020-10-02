/**
 * 
 */
package com.blz.training;

import java.util.Scanner;

/**
 * @author saideeksha
 *
 */
public class MoodAnalyzer {

	private String message;

	public MoodAnalyzer() {

	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyzeMood(String message) throws MoodAnalysisException {
		this.message = message;
		return analyzeMood();
	}

	public String analyzeMood() throws MoodAnalysisException {
		try {
			if (message.contains("Sad"))
				return "Sad";
			else
				return "Happy";
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			return "Happy";
		}

	}

	/**
	 * @param args
	 * @return
	 * @return
	 */
	public static void main(String[] args) throws MoodAnalysisException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String message = sc.nextLine();

		MoodAnalyzer obj = new MoodAnalyzer();
		String result = obj.analyzeMood(message);
		System.out.println(result);
	}

}