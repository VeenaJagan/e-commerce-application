package applicationShopping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AVRC {
	public String emailUser;
	public static ArrayList<String> items = new ArrayList<>();
	public HashMap<String, ArrayList<String>> hmap2 = new HashMap<>();
	public static ArrayList<String> items2 = new ArrayList<>();
	public static ArrayList<Integer> prices = new ArrayList<>(List.of(2000, 1000, 1500, 1200, 4000, 100, 150));
	public static int index;
	public static int sum = 0;
	static Main mainObj = new Main();

	public static void viewStock() {
		items.add("Shoes");
		items.add("Socks");
		items.add("Jewelry");
		items.add("Shirt");
		items.add("Tshirt");
		items.add("Sandals");
		items.add("FlipFlop");
	}

	public void operationsForUser(int optionEnter1) {
		switch (optionEnter1) {
		case 1:
			addInput();
			break;
		case 2:
			view();
			break;
		case 3:
			removeInput();
			break;
		case 4:
			checkout();
			System.out.println("Checkout price: " + sum);
			sum = 0;
			System.out.println("THANK YOU !! PLEASE VISIT AGAIN");
			System.out.println("Logging Out.....");
			items2.clear();

			mainObj.input();
			break;

		}
	}

	public void addInput() {
		System.out.println(items);
		Scanner inputForAdd = new Scanner(System.in);
		System.out.println("CHOOSE ITEMS FROM STOCK");
		String addElement = inputForAdd.nextLine();
		add(addElement);
		inputForMultipleTimes();
		inputForAdd.close();
	}

	public void removeInput() {
		System.out.println("ITEMS IN CART: " + items2);
		Scanner inputForDelete = new Scanner(System.in);
		System.out.println("ENTER ITEM TO DELETE");
		String elementDelete = inputForDelete.next();
		remove(elementDelete);
		inputForMultipleTimes();
		inputForDelete.close();

	}

	public String add(String addElement) {

		if (items.contains(addElement)) {
			if (!items2.contains(addElement)) {
				items2.add(addElement);
			}

			else
				return "ITEM EXISTS";
		}
		return "ITEM NOT FOUND";

	}

	public void view()

	{
		ArrayList<String> items3 = new ArrayList<>();
		items3.clear();
		items3 = items2;
		hmap2.put(emailUser, items3);
		System.out.println(hmap2);
		inputForMultipleTimes();

	}

	public String remove(String elementDelete) {

		if (items.contains(elementDelete)) {
			if (items2.contains(elementDelete)) {
				items2.remove(elementDelete);
				hmap2.put(emailUser, items2);
			} else {
				System.out.println("ITEM UNAVAILABLE IN CART");
				return "ITEM UNAVAILABLE IN CART";
			}
		}
		
		System.out.println("ITEM NOT IN STOCK");

		return "ITEM NOT IN STOCK";
	}

	public void inputForMultipleTimes() {
		Scanner in = new Scanner(System.in);
		System.out.println("1- ADD 2-VIEWCART 3-REMOVE 4-CHECKOUT");
		int addElementAgain = in.nextInt();
		operationsForUser(addElementAgain);
		in.close();
	}

	public int checkout() {
		int length = items2.size();
		for (int i = 0; i < length; i++) {
			index = items.indexOf(items2.get(i));
			sum += prices.get(index);

		}
		return sum;

	}

	public void clearElements() {
		items2.clear();
	}

}
