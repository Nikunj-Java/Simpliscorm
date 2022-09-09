package com.simplilearn.demo.JUNITSampleTestDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NestedTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each OUTER");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each OUTER");
	}

	@Test
	@DisplayName("Outer Test From OUTER")
	 void testOuter() {
		 System.out.println("Test case from OUTER");
	 }
	
	//@Disabled
	 @Nested
	class  Inner{
		
		@BeforeEach
		void setUp() throws Exception {
			System.out.println("Before Each INNER");
		}

		@AfterEach
		void tearDown() throws Exception {
			System.out.println("After Each INNER");
		}
		
		@Test
		@DisplayName("Inner Test")
		void testInner() {
			System.out.println("Test case from INNER");
		}
		
		@Nested
		class WhenX{
			
			@BeforeEach
			void setUp() throws Exception {
				System.out.println("Before Each WHENX");
			}

			@AfterEach
			void tearDown() throws Exception {
				System.out.println("After Each WHENX");
			}
			
			@Test
			@DisplayName("Inner WhenX")
			void testWhenX() {
				System.out.println("Test Case from WHENX");
			}
		}
		
	}

}
