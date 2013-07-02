package firstpass;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void emptyStringIsZero() {
		Calculator calc = buildCalc();
		assertEquals(0, calc.evaluate(" "));
	}

	@Test
	public void _234Is234() {
		Calculator calc = buildCalc();
		assertEquals(234, calc.evaluate("234"));
	}
	
	@Test
	public void _6Plus3Is9() {
		Calculator calc = buildCalc();
		assertEquals(9, calc.evaluate("6 + 3"));
	}
	
	@Test
	public void _12Plus33Is46() {
		Calculator calc = buildCalc();
		assertEquals(46, calc.evaluate("12 + 34"));
	}
	
	@Test
	public void _6Minus3Is3() {
		Calculator calc = buildCalc();
		assertEquals(3, calc.evaluate("6 - 3"));
	}
	
	@Test
	public void _18Minus4Is14() {
		Calculator calc = buildCalc();
		assertEquals(14, calc.evaluate("18 - 4"));
	}

	@Test
	public void _6Times3Is18() {
		Calculator calc = buildCalc();
		assertEquals(18, calc.evaluate("6 * 3"));
	}
	
	@Test
	public void _5Times22Is110() {
		Calculator calc = buildCalc();
		assertEquals(110, calc.evaluate("5 * 22"));
	}
	
	@Test
	public void _6Ove3Is2() {
		Calculator calc = buildCalc();
		assertEquals(2, calc.evaluate("6 / 3"));
	}
	
	@Test
	public void _36Over12Is3() {
		Calculator calc = buildCalc();
		assertEquals(3, calc.evaluate("36 / 12"));
	}
	
	
	private Calculator buildCalc() {
		return new CalculatorFactory().create();
	}

}
