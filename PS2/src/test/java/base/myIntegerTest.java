package base;

import static org.junit.Assert.*;

import org.junit.Test;

public class myIntegerTest {

	MyInteger odd_num = new MyInteger(3);
	MyInteger even_num = new MyInteger(2);
	MyInteger prime_num = new MyInteger(11);

	@Test
	public void testEven() {
		assertTrue(even_num.isEven());
	}

	@Test
	public void testOdd() {
		assertTrue(odd_num.isOdd());
	}

	@Test
	public void testPrime() {
		assertTrue(prime_num.isPrime());
	}

	@Test
	public void testEvenInt() {
		MyInteger myInt = new MyInteger(4);
		assertTrue(myInt.isEven(4));
	}

	@Test
	public void testOddInt() {
		MyInteger myInt = new MyInteger(5);
		assertTrue(myInt.isOdd(5));
	}

	@Test
	public void testPrimeInt() {
		MyInteger myInt = new MyInteger(3);
		assertTrue(myInt.isPrime(3));
	}

	@Test
	public void testEqualInt() {
		MyInteger myInt = new MyInteger(10);
		assertTrue(myInt.isEquals(10));
	}

	@Test
	public void testEvenMyInteger() {
		MyInteger myInt = new MyInteger(4);
		assertTrue(myInt.isEven(even_num));
	}

	@Test
	public void testOddMyInteger() {
		MyInteger myInt = new MyInteger(5);
		assertTrue(myInt.isOdd(odd_num));
	}

	@Test
	public void testPrimeMyInteger() {
		MyInteger myInt = new MyInteger(11);
		assertTrue(myInt.isPrime(prime_num));
	}

	@Test
	public void testEqualMyInteger() {
		MyInteger myInt = new MyInteger(4);
		assertTrue(myInt.isEquals(4));
	}

}
