package com.rushikesh;

import static org.junit.Assert.*;

import org.junit.Test;

public class HouseCostTest {

	@Test
	public void test() {
		
		HouseCost hr = new HouseCost( 0 , 120 , false );
		
		assertEquals( 144000.0 , hr.houseEstimate());
	
		hr = new HouseCost(1, 90, false);
		assertEquals(135000.0 , hr.houseEstimate());
		
		hr = new HouseCost( 2 , 130 , false );
		assertEquals( 234000.0 , hr.houseEstimate() );
		
		hr = new HouseCost( 2, 130 , true );
		assertEquals( 325000.0 , hr.houseEstimate());
	}

}
