package jfml.operator;

import jfml.enumeration.StandardOrMethodType;

public class OrConnector {

	
	/**
	 * 
	 * @param x value1
	 * @param y value2
	 * 	- MAX for implementing the connector or with the maximum as defined from Equation (A.21);
		- PROBOR for implementing the connector or with the probabilistic sum as defined from Equation (A.22);
		- BSUM for implementing the operator or with the bounded sum as defined from Equation (A.23);
		- DRS for implementing the operator or with the drastic sum as defined from Equation (A.24);
		- ESUM for implementing the operator or with the Einstein sum as defined from Equation (A.25);
		- HSUM for implementing the operator or with the Hamacher sum as defined from Equation (A.26);
		- NILMAX for implementing the operator or with the Nilpotent maximum as defined from Equation (A.27);
		- custom_\S* for a custom method for implementing the connector or.
	 * @return result of orMethod
	 */
	public static float operate(String orMethod, float x, float y){
		if(orMethod.equals(StandardOrMethodType.MAX.value()))
			return max(x,y);
		else if(orMethod.equals(StandardOrMethodType.PROBOR.value()))
			return probor(x,y);
		else if(orMethod.equals(StandardOrMethodType.BSUM.value()))
			return bsum(x,y);
		else if(orMethod.equals(StandardOrMethodType.DRS.value()))
			return drs(x,y);
		else if(orMethod.equals(StandardOrMethodType.ESUM.value()))
			return esum(x,y);
		else if(orMethod.equals(StandardOrMethodType.HSUM.value()))
			return hsum(x,y);
		else if(orMethod.equals(StandardOrMethodType.NILMAX.value()))
			return nilmax(x,y);
		else if(orMethod.contains("custom"))
			return custom_or(x,y,orMethod);
		else 
			return max(x,y);
	
	}
	

	/**
	 * custom or method
	 * @param x value1
	 * @param y value2
	 * @param orMethod
	 * @return custom or method
	 */
	public static float custom_or(float x, float y, String orMethod) {
		// TODO Auto-generated method stub
		return 0;
	}



    /**
     *
	 *	- NILMAX for implementing the operator or with the Nilpotent maximum as defined from Equation (A.27);
     * @param a
     * @param b
     * @return
     */
	public static float nilmax(float a, float b) {
		if(a+b<1)
			return Math.max(a, b);
		else
			return 1;
	}



	/** 	
	 *	- HSUM for implementing the operator or with the Hamacher sum as defined from Equation (A.26);
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static float hsum(float a, float b) {
		return (a+b-(2*a*b))/(1-(a*b));
	}



	/**
	 * 
	 *	- ESUM for implementing the operator or with the Einstein sum as defined from Equation (A.25);
	 * @param a
	 * @param b
	 * @return
	 */
	public static float esum(float a, float b) {
		return (a+b)/(1+a*b);
	}




	/**
	 * 
	 * - DRS for implementing the operator or with the drastic sum as defined from Equation (A.24);
	 * @param a
	 * @param b
	 * @return
	 */
	public static float drs(float a, float b) {
		if(a==0)
			return b;
		if(b==0)
			return a;
		else
			return 1;
	}




	/**
	 * 
	 *	- BSUM for implementing the operator or with the bounded sum as defined from Equation (A.23);
	 * @param a
	 * @param b
	 * @return
	 */
	public static float bsum(float a, float b) {
		return Math.min(1, a+b);
	}



	/**
	 *	- PROBOR for implementing the connector or with the probabilistic sum as defined from Equation (A.22);
	 * @param a
	 * @param b
	 * @return
	 */
	public static float probor(float a, float b) {
		return a+b-(a*b);
	}


	/**
	 *  - MAX for implementing the connector or with the maximum as defined from Equation (A.21);
	 * @param x
	 * @param y
	 * @return
	 */
	public static float max(float x, float y) {
		return Math.max(x, y);
	}
}
