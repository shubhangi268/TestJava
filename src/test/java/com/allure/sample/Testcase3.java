package com.allure.sample;

import org.testng.annotations.Test;

import org.testng.*;

public class Testcase3 {
  @SuppressWarnings("deprecation")
@Test
  public void testMethod3() {
	  throw new SkipException("testMethod3 will skip");
	  
  }
  
  @Test
  public void testMethod4() {
	  throw new SkipException("testMethod4 will skip");
	  
  }
}
