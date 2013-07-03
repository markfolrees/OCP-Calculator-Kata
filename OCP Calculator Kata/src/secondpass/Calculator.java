package secondpass;

public class Calculator {

	private final Worker worker;

	public Calculator(Worker worker) {
		this.worker = worker;
	}

	public int calculate(String arithmetic) {
		return worker.parse(arithmetic);
	}

}
