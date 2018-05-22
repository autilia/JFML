package jfml.operator;

import jfml.enumeration.StandardAndMethodType;

public class AndConnector {

	
	
	/**
	 * - MIN for implementing the operator and with the minimum as defined from Equation (A.14);
	 * - PROD for implementing the operator and with the product as defined from from Equation (A.15);
	 * - BDIF for implementing the operator and with bounded difference as defined from from Equation (A.16);
	 * - DRP for implementing the operator and with the drastic product as defined from from Equation (A.17);
	 * - EPROD for implementing the operator and with the Einstein product as defined from from Equation (A.18);
	 * - HPROD for implementing the operator and with the Hamacher product as defined from from Equation (A.19); 
	 * - NILMIN for implementing the operator and with the Nilpotent minimum as defined from from Equation (A.20);
	 * - custom_\S* for a custom method for operator and.
	 * 
	 * @param x
	 *            degree1 
	 * @param y
	 *            degree2
	 * @return The t-norm
	 */
	
	public static float operate(String op, float x, float y) {
	   if (op.equals(StandardAndMethodType.MIN.value()))
			return min(x, y);
		else if (op.equals(StandardAndMethodType.PROD.value()))
			return prod(x, y);
		else if (op.equals(StandardAndMethodType.BDIF.value()))
			return bdif(x, y);
		else if (op.equals(StandardAndMethodType.DRP.value()))
			return drp(x, y);
		else if (op.equals(StandardAndMethodType.EPROD.value()))
			return eprod(x, y);
		else if (op.equals(StandardAndMethodType.HPROD.value()))
			return hprod(x, y);
		else if (op.equals(StandardAndMethodType.NILMIN.value()))
			return nilmin(x, y);
		else if (op.contains("custom"))
			return custom_and(x, y, op);
		else
			return min(x, y);
	}
	


	/**
	 * - custom_\S* for a custom method.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static float custom_and(float x, float y, String act) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * - NILMIN for implementing the operator and with the Nilpotent minimum as defined from Equation (A.20);
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static float nilmin(float x, float y) {
		if (x + y > 1)
			return Math.min(x, y);
		else
			return 0;
	}

	/**
	 * - HPROD for implementing the operator and with the Hamacher product as defined from Equation (A.19); 
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static float hprod(float x, float y) {
		return (x + y) / (x + y - (x * y));
	}

	/**
	 * 	 
	 * - EPROD for implementing the operator and with the Einstein product as defined from Equation (A.18);
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static float eprod(float x, float y) {
		return (x + y) / (2 - (x + y - (x * y)));
	}

	/**
	 * 
	 * - DRP for implementing the operator and with the drastic product as defined from Equation (A.17);
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static float drp(float x, float y) {
		if (y == 1)
			return x;
		if (x == 1)
			return y;
		else
			return 0;
	}

	/**
	 * 
	 * - BDIF for implementing the operator and with bounded difference as defined from Equation (A.16);
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static float bdif(float x, float y) {
		return Math.max(0, (x + y - 1));
	}

	/**
	 * 
	 * - PROD for implementing the operator and with the product as defined from Equation (A.15);
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static float prod(float x, float y) {
		return x * y;
	}

	/**
	 * - MIN for implementing the operator and with the minimum as defined from Equation (A.14);
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static float min(float x, float y) {
		return Math.min(x, y);
	}

}
