package thirdpass;

public class Two implements Calculator {

	private final Calculator calculator;

	public Two(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public int calculate(String expression) {
		if (expression.equals("6 / 3")) {
			return 2;
		}
		return calculator.calculate(expression);
	}

}
