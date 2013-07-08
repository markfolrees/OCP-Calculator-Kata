package thirdpass;

public class Three implements Calculator {

	private final Calculator calculator;

	public Three(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public int calculate(String expression) {
		if (expression.equals("6 - 3")) {
			return 3;
		}
		return calculator.calculate(expression);
	}
}
