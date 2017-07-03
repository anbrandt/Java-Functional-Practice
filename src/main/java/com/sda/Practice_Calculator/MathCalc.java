package com.sda.Practice_Calculator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by andrzej on 03.07.17.
 */
public class MathCalc {

	private BinaryOperator binary;

	private Map<String, BinaryOperator> calcMap = new HashMap<>();

	public final static BinaryOperator ADD = (a,b)-> b + a;
	public final static BinaryOperator SUBSTRACT = (a,b) -> a - b;
	public final static BinaryOperator MULTIPLY = (a,b) -> a*b;
	public final static BinaryOperator DIVIDE = (a,b) -> {
		if(b==0) {
			throw new IllegalArgumentException("Not possible to divide by 0");
		}

		return a/b;
	};

	public Map<String, BinaryOperator> initializeMapOperators() {

		calcMap.put("+", ADD);
		calcMap.put("-", SUBSTRACT);
		calcMap.put("*", MULTIPLY);
		calcMap.put("/", DIVIDE);


		return calcMap;
	}


	public int getTheResult(String operator, int a, int b) {
		Map<String, BinaryOperator> stringBinaryOperatorMap = initializeMapOperators();
		BinaryOperator binary1 = stringBinaryOperatorMap.get(operator);

		Integer result = binary1.calculate(a, b);


		System.out.println("The result of " + a + " " + operator + " " + b + " is : " + result);
		return result;
	}





}
