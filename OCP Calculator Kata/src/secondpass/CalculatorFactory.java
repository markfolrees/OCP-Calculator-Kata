package secondpass;

public class CalculatorFactory {

	public Calculator create() {
		return new Calculator(new Worker(new SingleElementCalculator(),
				new MultipleElementCalculator(new Adder(), new Subtractor())));
	}

}
