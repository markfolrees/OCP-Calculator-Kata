package thirdpass;

public class Eighteen implements Calculator {

	private final Calculator calculator;

	public Eighteen(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public int calculate(String expression) {
		if (expression.equals("6 * 3")) {
			return 18;
		}
		return calculator.calculate(expression);
	}

}
