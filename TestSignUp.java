package applicationShopping;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class TestSignUp {

	@Test
	public void testForSignUp() {
		HashMap<String, String> expected = new HashMap<String, String>();
		NewUserRegistration Obj = new NewUserRegistration();
		Customer Obj2 = new Customer();
		expected.put("VEENA", "VEENAJ");
		Obj2.setNewUserEmailId("VEENA");
		Obj2.setNewUserPassword("VEENAJ");
		Obj.addNewUser(Obj2);

		assertEquals(expected, NewUserRegistration.hmap);

	}

}
