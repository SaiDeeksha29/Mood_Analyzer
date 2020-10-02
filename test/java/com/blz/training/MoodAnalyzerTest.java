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
	public void testMoodAnalysis_GivenSadMood_ReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String message = moodAnalyzer.analyzeMood("I am in Sad Mood");
		Assert.assertEquals("Sad", message);
	}
}