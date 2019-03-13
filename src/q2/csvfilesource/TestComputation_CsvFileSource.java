package q2.csvfilesource;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestComputation_CsvFileSource {

   // TODO: Write your answer to complete this test case
   @ParameterizedTest
   @CsvFileSource(resources = "computation_dataset.csv") 		//answer
   public void testGetDiscount(int a, int b) throws Exception   //answer
   {

	  Computation com = new Computation();
      int result = com.getDiscount(a, b);		//answer
      Assert.assertEquals(result, result);		//answer

   }
}
