package thirdpass;

import static java.lang.Integer.parseInt;

public class Add implements Calculator {

	private static final String OPERATOR_REGEX = " \\+ ";
	private final Calculator calculator;

	public Add(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public int calculate(String expression) {
		if (expression.contains("+")) {
			return parseInt(expression.split(OPERATOR_REGEX)[0])
					+ parseInt(expression.split(OPERATOR_REGEX)[1]);
		}
		return calculator.calculate(expression);
	}
}
