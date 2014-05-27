package coding.kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralsTest {
	//Find the pattern, and try to make the code simple using the pattern
	@Test
	public void zero() {
		assertEquals("", NumericConverter.romanize(0));
	}
	
	@Test
	public void one() {
		assertEquals("I", NumericConverter.romanize(1));
	}
	
	@Test
	public void two() {
		assertEquals("II", NumericConverter.romanize(2));
	}
	
	@Test
	public void three() {
		assertEquals("III", NumericConverter.romanize(3));
	}
	
	@Test
	public void four() {
		assertEquals("IV", NumericConverter.romanize(4));
	}
	
	@Test
	public void five() {
		assertEquals("V", NumericConverter.romanize(5));
	}
	
	@Test
	public void six() {
		assertEquals("VI", NumericConverter.romanize(6));
	}
	
	@Test
	public void seven() {
		assertEquals("VII", NumericConverter.romanize(7));
	}
	
	@Test
	public void eight() {
		assertEquals("VIII", NumericConverter.romanize(8));
	}
	
	@Test
	public void nine() {
		assertEquals("IX", NumericConverter.romanize(9));
	}
	
	@Test
	public void ten() {
		assertEquals("X", NumericConverter.romanize(10));
	}
	
	@Test
	public void eleven() {
		assertEquals("XI", NumericConverter.romanize(11));
	}

	@Test
	public void fourteen() {
		assertEquals("XIV", NumericConverter.romanize(14));
	}
	
	@Test
	public void eighteen() {
		assertEquals("XVIII", NumericConverter.romanize(18));
	}
	
	@Test
	public void nineteen() {
		assertEquals("XIX", NumericConverter.romanize(19));
	}
	
	@Test
	public void thirty() {
		assertEquals("XXX", NumericConverter.romanize(30));
	}
	
	@Test
	public void forty() {
		assertEquals("XL", NumericConverter.romanize(40));
	}
	
	@Test
	public void fortynine() {
		assertEquals("XLIX", NumericConverter.romanize(49));
	}
	
	@Test
	public void fifty() {
		assertEquals("L", NumericConverter.romanize(50));
	}
	
	@Test
	public void eightyfour() {
		assertEquals("LXXXIV", NumericConverter.romanize(84));
	}
	
	@Test
	public void ninetythree() {
		assertEquals("XCIII", NumericConverter.romanize(93));
	}
	
	@Test
	public void onehundred() {
		assertEquals("C", NumericConverter.romanize(100));
	}
	
	@Test
	public void fivehundred() {
		assertEquals("D", NumericConverter.romanize(500));
	}
	
	@Test
	public void onethousand() {
		assertEquals("M", NumericConverter.romanize(1000));
	}
	
	@Test
	public void eightteeneightyeight() {
		assertEquals("MDCCCLXXXVIII", NumericConverter.romanize(1888));
	}
	
	@Test
	public void nineteenseventyeight() {
		assertEquals("MCMLXXVIII", NumericConverter.romanize(1978));
	}
}
