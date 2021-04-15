package applicationShopping;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import java.util.HashMap;

public class ECommerceTest {

	@Test
	public void testAdd() {
		AVRC Obj = new AVRC();

		ArrayList<String> expected = new ArrayList<>();
		expected.add("Shoes");
		expected.add("Sandals");
		expected.add("Socks");
		expected.add("Jewelry");
		AVRC.viewStock();
		Obj.add("Shoes");
		Obj.add("Sandals");
		Obj.add("Socks");
		Obj.add("Jewelry");

		assertEquals(expected, AVRC.items2);
		AVRC.items2.clear();

	}
	
	@Test
	public void addExistingItem()
	{
		AVRC Obj = new AVRC();
		String expected="ITEM EXISTS";
		Obj.add("Shoes");
		assertEquals(expected,Obj.add("Shoes"));
		AVRC.items2.clear();
	}
	
	@Test
	public void itemNotFound()
	{
		AVRC Obj = new AVRC();
		String expected="ITEM NOT FOUND";
		assertEquals(expected,Obj.add("Hat"));
	}
	
//	@Test
//	public void testdelete() {
//		AVRC.items2.clear();
//
//		AVRC Obj = new AVRC();
//
//		ArrayList<String> expected = new ArrayList<>();
//		expected.add("Shoes");
//		expected.add("Sandals");
//		AVRC.viewStock();
//		Obj.add("Shoes");
//		Obj.add("Sandals");
//		Obj.add("Socks");
//		Obj.add("Jewelry");
//		Obj.remove("Socks");
//		Obj.remove("Jewelry");
//
//		assertEquals(expected, Obj.items2);
//		AVRC.items2.clear();
//
//	}
//
//	@Test
//	public void addDeleteAdd()
//	{
//		AVRC.items2.clear();
//		AVRC Obj = new AVRC();
//		ArrayList<String> expected = new ArrayList<>();
//		expected.add("Shoes");
//		expected.add("Sandals");
//		AVRC.viewStock();
//		Obj.add("Shoes");
//		Obj.add("Jewelry");
//		Obj.add("Socks");
//		Obj.remove("Socks");	
//		Obj.add("Sandals");
//		Obj.remove("Jewelry");
//
//		assertEquals(expected, Obj.items2);
//		AVRC.items2.clear();
//	}
//	
//	@Test
//	public void itemUnavailableInCart()
//	{
//		AVRC Obj = new AVRC();
//		Obj.add("Shoes");
//		Obj.add("Jewelry");
//		String expected="ITEM UNAVAILABLE IN CART";
//		assertEquals(expected,Obj.remove("Socks"));
//	}
//	 
//	
//	@Test
//	public void testcheckout() {
//		AVRC Obj = new AVRC();
//		AVRC.items2.clear();
//		AVRC.viewStock();
//		int expected = 9200;
//		Obj.add("Shoes");
//		Obj.add("Sandals");
//		Obj.add("Socks");
//		Obj.add("Jewelry");
//		Obj.checkout();
//		assertEquals(expected, Obj.checkout());
//		AVRC.items2.clear();
//
//	}
//	
//	
//
//	@Test
//	public void testForSignUp() {
//		HashMap<String, String> expected = new HashMap<String, String>();
//		NewUserRegistration Obj = new NewUserRegistration();
//		Customer Obj2 = new Customer();
//		expected.put("VEENA", "VEENAJ");
//		Obj2.setNewUserEmailId("VEENA");
//		Obj2.setNewUserPassword("VEENAJ");
//		Obj.addNewUser(Obj2);
//
//		assertEquals(expected, NewUserRegistration.hmap);
//
//	}
//
//	@Test
//	public void testForLogin() {
//
//		NewUserRegistration Obj = new NewUserRegistration();
//		Customer Obj2 = new Customer();
//		LoginValidation Obj3 = new LoginValidation();
//		Obj2.setNewUserEmailId("VEENA");
//		Obj2.setNewUserPassword("VEENAJ");
//		Obj.addNewUser(Obj2);
//		Obj2.setEmailIDofExistingUser("VEENA");
//		Obj2.setPasswordOfExistingUser("VEENAJ");
//		String expected = "LOGGING IN...";
//		String actual = Obj3.validateLogin(Obj2);
//		assertEquals(expected, actual);
//
//	}

}
