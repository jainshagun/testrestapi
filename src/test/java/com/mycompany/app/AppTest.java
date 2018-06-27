package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
	
   String message = "Hello World";	
   App messageUtil = new App(message);

   @Test
   public void testPrintMessage() {
	TestExample test = new TestExample();
	   String result = test.App(message)
      assertEquals(message,result);
   }
}
