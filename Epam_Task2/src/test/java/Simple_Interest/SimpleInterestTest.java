package Simple_Interest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleInterestTest {
 SimpleInterest obj=new  SimpleInterest();
	@Test
	void testCalc() {
		assertEquals(625.0, obj.calc(5000, 2.5, 5));
		assertEquals(0.0, obj.calc(5000, 0, 5));
		assertEquals(556.125, obj.calc(4449, 2.5, 5));
	}


}
