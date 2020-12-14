package tdt4250.xss.m2t.util;

import net.objecthunter.exp4j.*;

public class Util {
	public static double evaluate(String expression, String value) {
		Double x;
		try {
			x = Double.parseDouble(value);
		} catch (NumberFormatException e) {
			x = 1.0;
		}
		
	    Expression e = new ExpressionBuilder(expression)
	    		.variable("x")
	    		.build()
	    		.setVariable("x", x);

	    return e.evaluate();
	}
}
