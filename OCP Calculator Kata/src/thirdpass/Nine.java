package thirdpass;

public class Nine implements Calculator {

	private final SingleValue singleValue;

	public Nine(SingleValue singleValue) {
		this.singleValue = singleValue;
	}

	@Override
	public int calculate(String expression) {
		if (expression.equals("6 + 3")) {
			return 9;
		}
		return singleValue.calculate(expression);
	}

}
