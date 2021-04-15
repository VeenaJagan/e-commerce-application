package applicationShopping;

import java.util.Scanner;

public class SignInController {
	public void optionChoose(int option) {
		Scanner sc = new Scanner(System.in);
		Customer Obj = new Customer();
		AVRC fun = new AVRC();
		NewUserRegistration Obj2 = new NewUserRegistration();
		LoginValidation Obj3 = new LoginValidation();
		Main Obj4 = new Main();
		if (option == 1) {
			System.out.println("Enter Email ID");
			String emailIdOfexistingUser = sc.nextLine();
			System.out.println("Enter Password");
			String passwordOfExistingUser = sc.nextLine();
			Obj.setEmailIDofExistingUser(emailIdOfexistingUser);
			Obj.setPasswordOfExistingUser(passwordOfExistingUser);
			if (Obj3.validateLogin(Obj) == "LOGGING IN...") {
				AVRC.viewStock();
				fun.emailUser = emailIdOfexistingUser;
				fun.clearElements();

				System.out.println(
						"Shoes-2000Rs, Socks-1000Rs ,Jewelry-1500Rs, Shirt-1200Rs, Tshirt-4000Rs , Sandals-100Rs , FlipFlop-150Rs");
				System.out.println("1- ADD 2-VIEWCART 3-REMOVE 4-CHECKOUT");
				int optionEnter = sc.nextInt();
				fun.operationsForUser(optionEnter);

			} else {
				Obj4.input();
			}

		}
		if (option == 2) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("CREATE ACCOUNT");
			System.out.println("Enter Email ID");
			String newUserEmailID = sc1.nextLine();
			Obj.setNewUserEmailId(newUserEmailID);
			System.out.println("Enter PASSWORD");
			String newUserPassword = sc1.nextLine();
			Obj.setNewUserPassword(newUserPassword);
			Obj2.addNewUser(Obj);
			AVRC.items.clear();
			Obj4.input();

		}
	}
}
