package secondpass;

public class Subtractor implements Operator {

	@Override
	public int operate(String operator, int first, int second, int result) {
		// TODO Auto-generated method stub
		if (operator.equals("-")) {
			return first - second;
		}
		return result;
	}

}
