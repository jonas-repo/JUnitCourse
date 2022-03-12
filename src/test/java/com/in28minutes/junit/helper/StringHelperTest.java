package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper =  new StringHelper();
	String expected = "CD";
	
	@Test
	public void testTruncateAInFirst2Positions_Ain2FirstPostions() {
		
		//AACD => CD  
		assertEquals(expected, helper.truncateAInFirst2Positions("AACD"));		
	}
	

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPostions() {
		//ACD => CD
		assertEquals(expected, helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersSame_NegativeScenario() {
		//ABCD => false
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersSame_PositiveScenario() {
		//ABAB => true
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}
