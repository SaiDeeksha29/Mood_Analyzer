/**
 * 
 */
package com.blz.training;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @author saideeksha
 *
 */
public class MoodAnalyzerTest {

	@Test
	public void testMoodAnalysis_GivenSadMood_Constructor_ReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
		String message = moodAnalyzer.analyzeMood();
		Assert.assertEquals("Sad", message);
	}
}