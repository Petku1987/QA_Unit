package com.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntegerExamplesTest {

    @Test
    public void integerExploration(){
      Integer four = 4;
      Integer five = 5;
      String fiveS = "5";
      Integer gotfromValueOf = Integer.parseInt(fiveS);
      int gotfromParseInt = Integer.parseInt(fiveS);
      assertEquals("int value returns int 4", 4, four.intValue());
      assertEquals("int value returns int 5", 5, gotfromParseInt);

      int a = 4;
      int b = 4;
      assertEquals(a,b);
      assertTrue(a==b);
    }

}
