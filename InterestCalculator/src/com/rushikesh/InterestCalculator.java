package com.rushikesh;

public class InterestCalculator {

	
	
		public double simpleInterest( double principalAmount , double timeOfYears , double rateOfInterest  ){
			
			double totalSI = ( principalAmount * timeOfYears * rateOfInterest ) / 100 ;
			
			return totalSI;
		}
		
		
		public double compoundInterest(double principalAmount , double timeOfYears , double rateaofInterest ){
			
			double totalCI = principalAmount * Math.pow( 1 + rateaofInterest/100.0 , timeOfYears) - principalAmount ;
			
			return totalCI;
		}
}
