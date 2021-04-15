package applicationShopping;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestDelete {

	@Test
	public void testdelete() {
		AVRC.items2.clear();

		AVRC Obj = new AVRC();

		ArrayList<String> expected = new ArrayList<>();
		expected.add("Shoes");
		expected.add("Sandals");
		AVRC.viewStock();
		Obj.add("Shoes");
		Obj.add("Sandals");
		Obj.add("Socks");
		Obj.add("Jewelry");
		Obj.remove("Socks");
		Obj.remove("Jewelry");

		assertEquals(expected, Obj.items2);
		AVRC.items2.clear();

	}

	@Test
	public void addDeleteAdd() {
		AVRC.items2.clear();
		AVRC Obj = new AVRC();
		ArrayList<String> expected = new ArrayList<>();
		expected.add("Shoes");
		expected.add("Sandals");
		AVRC.viewStock();
		Obj.add("Shoes");
		Obj.add("Jewelry");
		Obj.add("Socks");
		Obj.remove("Socks");
		Obj.add("Sandals");
		Obj.remove("Jewelry");

		assertEquals(expected, Obj.items2);
		AVRC.items2.clear();
	}

	@Test
	public void itemUnavailableInCart() {
		AVRC Obj = new AVRC();
		Obj.add("Shoes");
		Obj.add("Jewelry");
		String expected = "ITEM UNAVAILABLE IN CART";
		assertEquals(expected, Obj.remove("Socks"));
	}

}
