package secondpass;

import static java.lang.Integer.parseInt;

public class MultipleElementCalculator {

	private final Operator[] operators;

	MultipleElementCalculator(Operator... operators) {
		this.operators = operators;

	}

	public int multipleValue(String[] parts) {
		int result = 0;
		int first = parseInt(parts[0]);
		int second = parseInt(parts[2]);
		String operatorSymbol = parts[1];
		for (Operator operator : operators) {
			result = operator.operate(operatorSymbol, first, second, result);
		}
		return result;
	}
}
