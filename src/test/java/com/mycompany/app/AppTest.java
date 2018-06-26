package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
     public void testUnit() {
        MyUnittest myUnittest = new MyUnittest();

        String result = myUnittest.println( "Hello World!" );

        assertEquals( true );

    }
}
