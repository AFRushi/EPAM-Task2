
/*
 * @EPAM PEP Task 2 : Calculator
 * @author rushikesh
 */

package com.rushikesh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;
import java.util.logging.Level;

/*
 * Class conataing methods to performing different operation
 */

class CalculatorMethods {

	final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private final Logger logger = Logger.getLogger(CalculatorMethods.class.getName());

	/*
	 * fuction to take input from the user.
	 */

	public String getStirng(String displayString) throws IOException {

		logger.log(Level.INFO, displayString);

		return reader.readLine();
	}

	/*
	 * Fuction to perform addition of two numbers.
	 * 
	 */

	public double performAddition(String num1, String num2) {

		double doubleNum1 = Double.parseDouble(num1);
		double doubleNum2 = Double.parseDouble(num2);

		return doubleNum1 + doubleNum2;
	}

	/*
	 * Fuction to perform Multiplication of two Numbers.
	 */

	public double performMultiplication(String num1, String num2) {

		double doubleNum1 = Double.parseDouble(num1);
		double doubleNum2 = Double.parseDouble(num2);

		return doubleNum1 * doubleNum2;

	}

	/*
	 * Fuction to perform Division of two numbers.
	 */

	public double performDivision(String num1, String num2) {

		try {

			double doubleNum1 = Double.parseDouble(num1);
			double doubleNum2 = Double.parseDouble(num2);

			return doubleNum1 / doubleNum2;

		} catch (ArithmeticException exception) {

			logger.log(Level.SEVERE, "Denominator Cannot be NUll", exception);
		}

		return 0.0;
	}
	
	public static boolean isNull(String str) {
        return str == null ? true : false;
    }
	
	 public static boolean isNullOrBlank(String param) {
	        if (isNull(param) || param.trim().length() == 0) {
	            return true;
	        }
	        return false;
	    }

	/*
	 * Calling Fuction to different fuction
	 */
	
	public void displayCalculaion() throws IOException {

		logger.info("Choose The Operation you wan to perform \n");

		String s1 = getStirng(" Enter the First Number :");
			
		String s2 = getStirng(" Enter the Second Number :");
		
		if(isNullOrBlank(s2)){
			logger.info("Denominaotr cannot be zero.Pls enter again");
			s2 =getStirng(" Enter the Second Number :");
			
		}
		
		logger.info(" 1- Addition \n\n 2- Multiplication \n\n 3-Division ");

		int operator = Integer.parseInt(reader.readLine());
	//	System.out.println(operator);

		double result = 0.0;

		switch (operator) {

		case 1 :{
			
			result = performAddition(s1, s2);
			logger.info("Addition is :" + result);
			break;
		}

		case 2 :{
			
			result = performMultiplication(s1, s2);
			logger.info("Multiplication of Two number is :" + result);
			break;
		}
			
		case 3 :{
			
			result = performDivision(s1, s2);

			if (result == 0) {
				logger.info("Denominator cannot be Null");
			} else
				logger.info("Dividion of two no is : " + result);

			break;
		}
		
		default:
			logger.info(" Enter  from the given option ");
		}
	}

}

