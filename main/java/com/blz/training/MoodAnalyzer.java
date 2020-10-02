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

	public String analyzeMood(String message) {
		if (message.contains("Sad"))
			return "Sad";
		else
			return "Happy";

	}

	/**
	 * @param args
	 * @return
	 * @return
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String message = sc.nextLine();

		MoodAnalyzer obj = new MoodAnalyzer();
		String result = obj.analyzeMood(message);
		System.out.println(result);
	}

}