package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.rushikesh.InterestCalculator;

public class InterestTestClass {

	@Test
	public void CompoundTest() {
		

		InterestCalculator calc = new InterestCalculator();
		
		assertEquals("Simple Interest Check ", 1873.2708539999985 , calc.compoundInterest( 20202, 3 , 3 ) , 0  );
	}

	@Test
	public void SimpleTest(){
		
		InterestCalculator calc = new InterestCalculator();
	
		assertEquals("Simple Interest Check ", 1515.15  , calc.simpleInterest( 20202, 3 , 2.5 ) , 0  );
	}
}
