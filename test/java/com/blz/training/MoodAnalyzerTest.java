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
	public void testMoodAnalysis_GivenHappyMood_Constructor_ReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
		String message = moodAnalyzer.analyzeMood();
		Assert.assertEquals("Happy", message);
	}
}