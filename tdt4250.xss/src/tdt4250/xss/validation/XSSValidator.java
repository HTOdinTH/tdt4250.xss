/*
 * generated by Xtext 2.22.0
 */
package tdt4250.xss.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.xtext.validation.Check;

import net.objecthunter.exp4j.ExpressionBuilder;
import tdt4250.xss.xSS.Expression;
import tdt4250.xss.xSS.XSSPackage;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class XSSValidator extends AbstractXSSValidator {
	
//	public static final String INVALID_NAME = "invalidName";
//
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital",
//					XSSPackage.Literals.GREETING__NAME,
//					INVALID_NAME);
//		}
//	}
	
	@Check
	public void checkExpressionValid(Expression expression) {
		if (expression.getName().contains("{")) {
			try {
				String result = expression.getName().replace("\"", "");
				Pattern pattern = Pattern.compile("(\\{.*?\\})");
				Matcher matcher = pattern.matcher(result);

				while (matcher.find()) {
					String group = matcher.group();
					String expr = group.replace("{", "").replace("}", "");
					Boolean valid = new ExpressionBuilder(expr)
			    		.variable("x")
			    		.build()
			    		.setVariable("x",  1.0)
			    		.validate().isValid();
					if (!valid) {
						throw new IllegalArgumentException();
					}
				}
			} catch (IllegalArgumentException iae) {
				error("Invalid mathematical expression", XSSPackage.Literals.EXPRESSION__NAME);
			}
		}
	}
	
}
