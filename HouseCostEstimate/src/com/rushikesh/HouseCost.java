package com.rushikesh;

/*
 * @EPAM PEP PRogram TO calculate or Estimate the cost Of house Creation
 * @author : rushikesh
 */

public class HouseCost {

	
	/*
	 *  typeMaterial :
	 *  
	 *  StandarsMaterial =0;
	 *  Above Standard Material = 1
	 *  HighStandard material =2
	 *
	 */
	
		private int typeOfMateraial ;
		private double houseArea ;
		boolean isautomated;
		
		HouseCost(int typeOfMateraial, double houseArea, boolean isautomated) {
			super();
			this.typeOfMateraial = typeOfMateraial;
			this.houseArea = houseArea;
			this.isautomated = isautomated;
		}
		
		public double houseEstimate(){
			
			int cost = 0;
			
			if(typeOfMateraial == 0)
				cost = 1200;
			
			else if(typeOfMateraial == 1 )
				cost = 1500;
			
			else if(typeOfMateraial == 2 && isautomated == true )
				cost = 2500;
				
			else
				cost = 1800;
			
			return houseArea * cost ;
		}
}
