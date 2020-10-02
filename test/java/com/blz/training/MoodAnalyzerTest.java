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
	public void givenNullMoodShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals("Happy", mood);
	}
}