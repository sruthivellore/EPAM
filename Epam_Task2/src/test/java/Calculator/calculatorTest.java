package Calculator;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

class calculatorTest {

	calculator obj=new calculator();
	@Test
	void testAdd() {
		assertEquals(10, obj.add(15,-5));
		assertEquals(6, obj.add(2,4));
		assertEquals(10, obj.add(5,5));
		assertEquals(-7, obj.add(-10,3));
		assertEquals(16, obj.add(10,6));
	}
	@Test
	void testMultiply()
	{
		assertEquals(30, obj.multiply(5,6));
		assertEquals(-50, obj.multiply(10,-5));
		assertEquals(-25, obj.multiply(5,-5));
		assertEquals(40, obj.multiply(-20,-2));
		assertEquals(0, obj.multiply(0,6));
		
	}
	@Test
	void testDivide()
	{
		assertEquals(1.0, obj.divide(5,5));
		assertEquals(5.0, obj.divide(25,5));
		assertEquals(-5.0, obj.divide(-25,5));
		assertEquals(-5.0, obj.divide(25,-5));
		assertEquals(5.0, obj.divide(-25,-5));
		Assertions.assertThrows(ArithmeticException.class,()->obj.divide(25, 0));
	}

}