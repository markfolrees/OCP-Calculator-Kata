package secondpass;

public class Divider implements Operator {

	@Override
	public int operate(String operator, int first, int second, int result) {
		if (operator.equals("/")) {
			return first / second;
		}
		return result;
	}

}
