package applicationShopping;

public class Customer {
	private String emailIDofExistingUser;
	private String passwordOfExistingUser;
	private String newUserEmailId;
	private String newUserPassword;

	public String getNewUserEmailId() {
		return newUserEmailId;
	}

	public void setNewUserEmailId(String newUserEmailId) {
		this.newUserEmailId = newUserEmailId;
	}

	public String getNewUserPassword() {
		return newUserPassword;
	}

	public void setNewUserPassword(String newUserPassword) {
		this.newUserPassword = newUserPassword;
	}

	public String getEmailIDofExistingUser() {
		return emailIDofExistingUser;
	}

	public void setEmailIDofExistingUser(String emailIDofExistingUser) {
		this.emailIDofExistingUser = emailIDofExistingUser;
	}

	public String getPasswordOfExistingUser() {
		return passwordOfExistingUser;
	}

	public void setPasswordOfExistingUser(String passwordOfExistingUser) {
		this.passwordOfExistingUser = passwordOfExistingUser;
	}

}