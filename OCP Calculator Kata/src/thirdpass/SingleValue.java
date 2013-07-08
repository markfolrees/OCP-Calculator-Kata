package thirdpass;

import static java.lang.Integer.parseInt;

public class SingleValue implements Calculator {

	private final Calculator calculator;

	public SingleValue(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public int calculate(String expression) {
		try {
			return parseInt(expression);
		} catch (NumberFormatException e) {
			return calculator.calculate(expression);
		}
	}

}
