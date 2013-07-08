package thirdpass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void spacesAre0() {
		Calculator calculator = new CalculatorFactory().create();
		assertEquals(0, calculator.calculate("  "));
	}

	@Test
	public void _234Is234() {
		Calculator calculator = new CalculatorFactory().create();
		assertEquals(234, calculator.calculate("234"));
	}

	@Test
	public void _6Plus3Is9() {

		Calculator calculator = new CalculatorFactory().create();
		assertEquals(9, calculator.calculate("6 + 3"));
	}

	@Test
	public void _12Plus34Is46() {

		Calculator calculator = new CalculatorFactory().create();
		assertEquals(46, calculator.calculate("12 + 34"));
	}

	@Test
	public void _6Less3Is3() {
		Calculator calculator = new CalculatorFactory().create();
		assertEquals(3, calculator.calculate("6 - 3"));
	}

	@Test
	public void _18Less4Is14() {
		Calculator calculator = new CalculatorFactory().create();
		assertEquals(14, calculator.calculate("18 - 4"));
	}

	@Test
	public void _6Times3Is18() {
		Calculator calculator = new CalculatorFactory().create();
		assertEquals(18, calculator.calculate("6 * 3"));
	}

	@Test
	public void _5Times22Is110() {
		Calculator calculator = new CalculatorFactory().create();
		assertEquals(110, calculator.calculate("5 * 22"));
	}

	@Test
	public void _6Over3Is2() {
		Calculator calculator = new CalculatorFactory().create();
		assertEquals(2, calculator.calculate("6 / 3"));
	}

	@Test
	public void _36Over12Is3() {
		Calculator calculator = new CalculatorFactory().create();
		assertEquals(3, calculator.calculate("36 / 12"));
	}
}