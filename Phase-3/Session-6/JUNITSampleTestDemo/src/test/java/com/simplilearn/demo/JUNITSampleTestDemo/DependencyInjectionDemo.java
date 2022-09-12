package com.simplilearn.demo.JUNITSampleTestDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class DependencyInjectionDemo {

	public DependencyInjectionDemo(TestInfo info) {
		System.out.println(info.getDisplayName());
	}
	
	@Test
	@DisplayName("My Method")
	public void myTest(TestInfo info) {
		
		System.out.println("Display Name:"+info.getDisplayName());
		assertEquals("My Method", info.getDisplayName());
	}
	
	@Test
	@DisplayName("My Method1")
	@Tag("mytag")
	public void myTest1(TestInfo info) {
		
		System.out.println("Display Name:"+info.getDisplayName());
		System.out.println("Tags:"+info.getTags());
		
		assertEquals("My Method1", info.getDisplayName());
		assertTrue(info.getTags().contains("mytag") );
	}

}
