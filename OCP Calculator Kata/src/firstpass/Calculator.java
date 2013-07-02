package firstpass;

import static java.lang.Integer.parseInt;

public class Calculator {

	public int evaluate(String arithmetic) {
		if (!arithmetic.equals(" ")) {
			String[] parts = arithmetic.split(" ");
			if (parts.length == 1) {
				return parseInt(arithmetic);
			}
			
			String operator = parts[1];
			int first = parseInt(parts[0]);
			int second = parseInt(parts[2]);
			switch(operator){
			case "+":
				return first + second;
			case "-":
				return first - second;
			case "*":
				return first * second;
			case "/":
				return first / second;

			}
		}

		return 0;
	}

}
