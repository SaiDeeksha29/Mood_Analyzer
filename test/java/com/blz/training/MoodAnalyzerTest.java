/**
 * 
 */
package com.blz.training;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @author saideeksha
 *
 */
public class MoodAnalyzerTest {

	@Test
	public void givenNullMoodShouldThrowException() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("NULL");
		try {
			moodAnalyzer.analyzeMood();
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			Assert.assertEquals(MoodAnalysisException.MoodAnalysisError.NULL, e.type);
		}

	}

	@Test
	public void givenEmptyMoodShouldThrowException() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
		try {
			moodAnalyzer.analyzeMood();
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			Assert.assertEquals(MoodAnalysisException.MoodAnalysisError.EMPTY, e.type);
		}

	}
}