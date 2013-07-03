package secondpass;

public class Worker {

	private final SingleElementCalculator single;
	private final MultipleElementCalculator multiple;

	public Worker(SingleElementCalculator single,
			MultipleElementCalculator multiple) {
		this.single = single;
		this.multiple = multiple;

	}

	public int parse(String arithmetic) {
		String[] parts = arithmetic.split(" ");

		switch (parts.length) {

		case 3:
			return multiple.multipleValue(parts);
		default:
			return single.singleValue(arithmetic);
		}

	}
}
