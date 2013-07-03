package secondpass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void spacesAreZero() {
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
}