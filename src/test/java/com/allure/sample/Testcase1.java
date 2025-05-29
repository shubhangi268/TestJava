package com.allure.sample;

import org.testng.annotations.Test;

import org.testng.*;

public class Testcase1 {
  @SuppressWarnings("deprecation")
@Test
  public void testMethod1() {
	  Assert.assertTrue(false);
	  System.out.println("testMethod1 is not working as expected");
	  
  }
}
