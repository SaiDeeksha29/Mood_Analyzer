/**
 * 
 */
package com.blz.training;

/**
 * @author saideeksha
 *
 */
public class MoodAnalysisException extends Exception {
	enum MoodAnalysisError {
		NULL, EMPTY
	}

	MoodAnalysisError type;

	public MoodAnalysisException(String message, MoodAnalysisError type) {
		super(message);
		this.type = type;
	}
}
