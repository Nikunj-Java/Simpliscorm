package com.simplilearn.demo.JUNITSampleTestDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class ConditionalTest {

	@Test
	@EnabledOnOs({OS.WINDOWS})
	 public void runOnWindows() {
		 System.out.println("This run on windows OS");
	 }
	
	@Test
	@DisabledOnOs({OS.MAC})
	public void notRunOnMAC() {
		System.out.println("Not Run On MAC");
	}
	
	@Test
	@EnabledOnOs({OS.MAC})
	public void RunOnMAC() {
		System.out.println("This Run On MAC");
	}
	
	@Test
	@EnabledOnOs({OS.LINUX})
	public void runOnLINUX() {
		System.out.println("This run on LINUX OS");
	}

}
