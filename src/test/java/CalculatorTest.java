
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

		private Calculator objCalcUnderTest;

			@Before
			public void setUp() {
			//Arrange
				objCalcUnderTest = new Calculator();
			}
			
		
			
			
			@Test
			public void testAdd() { 
				int a = 15; int b = 20; //test data
				int expectedResult = 35; //oracle
				//Act 
				long result = objCalcUnderTest.add(a, b); //test sequence
				//Assert
				Assert.assertEquals(expectedResult, result); //assertions
			}

}
