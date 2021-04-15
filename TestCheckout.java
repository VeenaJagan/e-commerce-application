package applicationShopping;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCheckout {

	@Test
	public void testcheckout() {
		AVRC Obj = new AVRC();
		AVRC.items2.clear();
		AVRC.viewStock();
		int expected = 9200;
		Obj.add("Shoes");
		Obj.add("Sandals");
		Obj.add("Socks");
		Obj.add("Jewelry");
		Obj.checkout();
		assertEquals(expected, Obj.checkout());
		AVRC.items2.clear();

	}

}
