package applicationShopping;

public class LoginValidation {
	NewUserRegistration Obj1 = new NewUserRegistration();

	public String validateLogin(Customer Obj) {

		if (NewUserRegistration.hmap.containsKey(Obj.getEmailIDofExistingUser())) {
			String tempVal = NewUserRegistration.hmap.get(Obj.getEmailIDofExistingUser());
			if (tempVal.equals(Obj.getPasswordOfExistingUser())) {
				System.out.println("LOGGING IN...");
				return "LOGGING IN...";
			} else {
				System.out.println("INVALID CREDENTIALS");
				return "INVALID CREDENTIALS";
			}

		}
		System.out.println("INVALID CREDENTIALS");
		return "INVALID CREDENTIALS";
	}
}