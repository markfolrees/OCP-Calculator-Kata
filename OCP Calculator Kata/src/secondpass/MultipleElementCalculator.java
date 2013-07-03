package secondpass;

public class MultipleElementCalculator {

	private final Adder adder;
	private final Subtractor subtractor;

	MultipleElementCalculator(Adder adder, Subtractor subtractor) {
		this.adder = adder;
		this.subtractor = subtractor;

	}

	public int multipleValue(String[] parts) {
		int result = 0;
		int first = Integer.parseInt(parts[0]);
		int second = Integer.parseInt(parts[2]);
		String operator = parts[1];
		result = adder.operate(operator, first, second, 0);
		result = subtractor.operate(operator, first, second, result);
		return result;
	}
}