package applicationShopping;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSignIn {

	@Test
	public void testForLogin() {

		NewUserRegistration Obj = new NewUserRegistration();
		Customer Obj2 = new Customer();
		LoginValidation Obj3 = new LoginValidation();
		Obj2.setNewUserEmailId("VEENA");
		Obj2.setNewUserPassword("VEENAJ");
		Obj.addNewUser(Obj2);
		Obj2.setEmailIDofExistingUser("VEENA");
		Obj2.setPasswordOfExistingUser("VEENAJ");
		String expected = "LOGGING IN...";
		String actual = Obj3.validateLogin(Obj2);
		assertEquals(expected, actual);

	}
}
