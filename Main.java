package applicationShopping;

import java.util.Scanner;

public class Main {

	public void input() {
		Scanner sc = new Scanner(System.in);
		SignInController Obj = new SignInController();
		System.out.println("WELCOME TO VEENA ECOMMERCE");
		System.out.print("1-Sign In 2-Sign Up: ");
		int options = sc.nextInt();
		Obj.optionChoose(options);
	}

	public static void main(String[] args) {

		Main mainObj = new Main();
		mainObj.input();
	}

}