package secondpass;

public class Adder implements Operator {

	@Override
	public int operate(String operator, int first, int second, int result) {

		switch (operator) {
		case "+":
			result = first + second;
		}
		return result;
	}
}
