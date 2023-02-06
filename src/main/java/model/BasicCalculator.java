/**
 * @author abhit - aryan9
 * CIS175 - Spring 2023
 * Feb 6, 2023
 */
package model;

public class BasicCalculator {

	private int firstValue;
	private int secondValue;
	private int add;
	private int subtract;
	private int multiply;
	private int divide;
	private int remainder;
	private int result;
	
	/**
	 * @return the firstValue
	 */
	public int getFirstValue() {
		return firstValue;
	}

	/**
	 * @param firstValue the firstValue to set
	 */
	public void setFirstValue(int firstValue) {
		this.firstValue = firstValue;
	}

	/**
	 * @return the secondValue
	 */
	public int getSecondValue() {
		return secondValue;
	}

	/**
	 * @param secondValue the secondValue to set
	 */
	public void setSecondValue(int secondValue) {
		this.secondValue = secondValue;
	}

	/**
	 * @return the add
	 */
	public int getAdd() {
		add = add(firstValue, secondValue);
		return add;
	}

	/**
	 * @param add the add to set
	 */
	public void setAdd(int add) {
		this.add = add;
	}

	/**
	 * @return the subtract
	 */
	public int getSubtract() {
		subtract = subtract(firstValue, secondValue);
		return subtract;
	}

	/**
	 * @param subtract the subtract to set
	 */
	public void setSubtract(int substract) {
		this.subtract = substract;
	}

	/**
	 * @return the multiply
	 */
	public int getMultiply() {
		multiply = multiply(firstValue, secondValue);
		return multiply;
	}

	/**
	 * @param multiply the multiply to set
	 */
	public void setMultiply(int multiply) {
		this.multiply = multiply;
	}

	/**
	 * @return the divide
	 */
	public int getDivide() {
		divide = divide(firstValue, secondValue);
		return divide;
	}

	/**
	 * @param divide the divide to set
	 */
	public void setDivide(int divide) {
		this.divide = divide;
	}

	/**
	 * @return the remainder
	 */
	public int getRemainder() {
		remainder = remainder(firstValue, secondValue);
		return remainder;
	}

	/**
	 * @param remainder the remainder to set
	 */
	public void setRemainder(int remainder) {
		this.remainder = remainder;
	}

	/**
	 * @return the result
	 */
	public int getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(int result) {
		this.result = result;
	}

	public BasicCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BasicCalculator(int result) {
		super();
		this.result = result;
	}
	
	public BasicCalculator(int firstValue, int secondValue) {
		super();
		this.firstValue = firstValue;
		this.secondValue = secondValue;
	}
	
	public int add(int value1, int value2) {
		result = value1 + value2;
		return result;
	}
	
	public int subtract(int value1, int value2) {
		result = value1 - value2;
		return result;
	}
	
	public int multiply(int value1, int value2) {
		result = value1 * value2;
		return result;
	}
	
	public int divide(int value1, int value2) {
		result = value1 / value2;
		return result;
	}
	
	public int remainder(int value1, int value2) {
		int remainder = value1 % value2;
		return remainder; 
	}
	
	@Override
	public String toString() {
		return "Addition: " + add(firstValue, secondValue) + "\nSubtraction: " + subtract(firstValue, secondValue) +
				"\nMultiplication: " + multiply(firstValue, secondValue) + "\nDivision: " + divide(firstValue, secondValue) +
				"\nRemainder: " + remainder(firstValue, secondValue);
	}
}
