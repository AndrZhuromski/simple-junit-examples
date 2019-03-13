package q1.computation;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestComputation_Parameterized {
   int mInput1, mInput2, mExpected;
   Computation com = new Computation();

   @Parameters
   public static Collection<Object[]> data() 
   {
      return Arrays.asList(new Object[][] 
    		  { 				// answer
    	  		{ 100, 1, 20 }, // 1st input
    	  		{ 101, 2, 30 }, // 2nd input
    	  		{ 102, 3, 40 }  // 3rd input 
              });
      
   }

   public TestComputation_Parameterized(int input1, int input2, int expected) 
   {
	   this.mInput1 = input1;			//answer
	   this.mInput2 = input2;			//answer
	   this.mExpected = expected;		//answer
   }

   @Test
   public void testGetDiscount() throws Exception 
   {
	   int result = com.getDiscount(mInput1, mInput2);  //answer
	   Assert.assertEquals(mExpected, result);			//answer
   }
}
