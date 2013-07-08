package thirdpass;

public class CalculatorFactory {

	public Calculator create() {
		return new Divider(new Two(new Multiply(new Eighteen(new Subtract(
				new Three(new Add(new Nine(new SingleValue(new Zero())))))))));
	}

}
