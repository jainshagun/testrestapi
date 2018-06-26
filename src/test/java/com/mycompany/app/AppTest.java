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
        MyUnit_test myUnit_test = new MyUnit_test();

        String result = myUnit.println( "Hello World!" );

        assertEquals( true );

    }
}
