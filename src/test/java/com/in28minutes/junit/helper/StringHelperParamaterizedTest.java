package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class) // to indicate we are going to include our own params
public class StringHelperParamaterizedTest {
	
	//generates the information we want to send to constructor params
	@Parameters
	public static Collection<String[]> testParameters()
	{
		String expectedOutputs[][] = {{"AACD","CD"},{"ACD","CD"}}; //takes parameters in order for every part of the array
		return Arrays.asList(expectedOutputs);
			
	}
	
	//constructor is going to take the parameters
	public StringHelperParamaterizedTest(String  input, String expected) { 
		super(); 
		this.expected = expected;
		this.input = input;
	}



	private StringHelper  helper =  new StringHelper();
	private String expected;
	private String input;
	
	
	
	@Test
	public void testTruncateAInFirst2Positions_Ain2FirstPostions() {
		
		//AACD => CD  
		assertEquals(expected, helper.truncateAInFirst2Positions(input));		
	}
	

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPostions() {
		//ACD => CD
		assertEquals(expected, helper.truncateAInFirst2Positions(input));
	}
	

}
