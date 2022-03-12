package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("First initialization before start executing");
	}
	
	@Before
	public void setup() {
		System.out.println("Before condition to start");
	}

	
	@Test
	public void test1() {
		System.out.println("test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("test 2");
	}

	@After
	public void tearDown() {
		System.out.println("After condition at the end \n");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Last step before closing the class");
	}
	

}
