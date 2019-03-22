package HouseConstruction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class houseConstructionExpenseTest {

	 houseConstructionExpense obj=new houseConstructionExpense();
		@Test
		void testCalc() {
			assertEquals(3000000, obj.calc("standard materials", 2500, "Fully Automated Home"));
			assertEquals(3000000, obj.calc("standard materials", 2500, "Not Fully Automated Home"));
			assertEquals(4500000, obj.calc("high standard materials", 2500, "Not Fully Automated Home"));
			assertEquals(6250000, obj.calc("high standard materials", 2500, "Fully Automated Home"));
			assertEquals(3750000, obj.calc("above standard materials", 2500, "Fully Automated Home"));
			assertEquals(3750000, obj.calc("above standard materials", 2500, "Not Fully Automated Home"));	
	}

}
