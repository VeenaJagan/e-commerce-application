package applicationShopping;

import java.util.HashMap;

public class NewUserRegistration {
	public static HashMap<String, String> hmap = new HashMap<String, String>();

	public void addNewUser(Customer Obj) {
		hmap.put(Obj.getNewUserEmailId(), Obj.getNewUserPassword());
	}

}