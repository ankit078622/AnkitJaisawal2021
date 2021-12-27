package org.espire.main;

import java.util.Iterator;
import java.util.Scanner;

import org.espire.service.Inventory;

import ore.espire.entity.Bucket;
import ore.espire.entity.Product;

public class VendingMachine {

	public static void vendingMachine() {

		/**
		 * Creating the object of Bucket and Inventory class
		 */
		Bucket bucket = new Bucket();
		Inventory inventory = new Inventory();

		/**
		 * Adding some items to inventory
		 */
		inventory.addItemToInventory(1, new Product("COCK", 50, 20));
		inventory.addItemToInventory(2, new Product("PEPSI", 90, 20));
		inventory.addItemToInventory(3, new Product("CHIPS", 20, 20));
		inventory.addItemToInventory(4, new Product("5STAR", 10, 20));

		/**
		 * Declaring variavbles
		 */
		String selectedItem = "";
		Integer selectedItemPrice = 0;
		Integer quantity = 0, count = 0, caculate = 0, total = 0, discountCount = 0;
		Float returnedAmount = 0.0f, insertedCoin = 0.0f;

		/**
		 * Option displaying on console
		 */
		System.out.println("1.Inventory item list.\n2.Purchase\n3.Exit");
		System.out.print("Enter your choice:");

		/**
		 * Creating objcet of scanner class
		 */
		Scanner sc = new Scanner(System.in);
		/**
		 * Customer can enter here there choice according to the options displaying on
		 * console
		 */
		Integer choice = sc.nextInt();

		/**
		 * while loop for displaying the option's on the screen again and again
		 */
		while (choice <= 3 && choice > 0) {
			switch (choice) {
			/**
			 * Case 1 is for displaying the item present in the inventory
			 */
			case 1:
				Iterator<Integer> itemIterator = inventory.getInventory().keySet().iterator();
				System.out.println("Serial Number \t Product Name \t Product Price \t Quantity");
				while (itemIterator.hasNext()) {
					Integer key = itemIterator.next();
					Product value = inventory.getInventory().get(key);
					System.out.println(key + " \t\t " + value.getItemName() + " \t\t " + value.getItemPrice() + " \t\t "
							+ value.getQuantity());
				}
				break;
			/**
			 * case 2 is for purchasing the item. it uses the Bucket class for storing the
			 * record of sold item
			 */
			case 2:
				System.out.print("Enter the item name : ");
				selectedItem = sc.next();
				Iterator<Integer> itemIterator1 = inventory.getInventory().keySet().iterator();
				while (itemIterator1.hasNext()) {
					Integer key = itemIterator1.next();
					Product value = inventory.getInventory().get(key);
					if (selectedItem.toUpperCase().equals(value.getItemName())) {
						selectedItemPrice = (int) value.getItemPrice();
						System.out.print("Enter the quantity : ");
						quantity = sc.nextInt();
						count = count + 1;
						bucket.addItemToBucket(count,
								new Product(selectedItem.toUpperCase(), selectedItemPrice, quantity));
						System.out.println("Entered item price is : " + selectedItemPrice);
					}
				}
//			System.out.print("Enter the quantity : ");
//			quantity=sc.nextInt();
//			count=count+1;
//			bucket.addItemToBucket(count, new Product(selectedItem.toUpperCase(), selectedItemPrice, quantity));
				break;
			/**
			 * case 3 is used to display the bucket list and the total amount
			 */
			case 3:
				if (bucket.length() > 0) {
					Iterator<Integer> itemBucket = bucket.getBucket().keySet().iterator();
					System.out.println("Serial Number \t Product Name \t Product Price \t Quantity \t Sum");

					/**
					 * This loop print list of item present in the bucket for cureent session
					 */
					while (itemBucket.hasNext()) {
						Integer key = itemBucket.next();
						Product value = bucket.getBucket().get(key);
						caculate = (int) (value.getItemPrice() * value.getQuantity());
						total = total + caculate;
						System.out.println(key + " \t\t " + value.getItemName() + " \t\t " + value.getItemPrice()
								+ " \t\t " + value.getQuantity() + " \t\t " + caculate);
						if ((value.getItemName().equals("CHIPS") && value.getQuantity() == 5)
								|| (value.getItemName().equals("COCK") && value.getQuantity() == 5)) {
							discountCount++;
						}
					}
					/**
					 * It checks the chips and pepsi quantity is 5 or not If quantity is 5 the 20%
					 * discount will be calculated
					 */
					if (discountCount == 2) {
						System.out.println("Congrutulations you will get 20 % discount.");
						System.out.print("Total amount : " + (total - ((float) total * 0.2)));
						System.out.print("\nInserted coin value : ");
						insertedCoin = sc.nextFloat();
						if (insertedCoin < total) {
							System.out.println("You have inserted the wrong amount in the machine please try again");
							System.out.println("Thank You");
							discountCount = 0;
							total = 0;
							caculate = 0;
							break;
						}
						returnedAmount = (float) (insertedCoin - (total - ((float) total * 0.2)));
					} else {
						System.out.print("Total amount : " + total);
						System.out.print("\nInserted coin value : ");
						insertedCoin = sc.nextFloat();
						if (insertedCoin < total) {
							System.out.println("You have inserted the wrong amount in the machine please try again");
							System.out.println("Thank You");
							discountCount = 0;
							total = 0;
							caculate = 0;
							break;
						}
						returnedAmount = insertedCoin - total;
					}

					System.out.print("Returned coin after deduction : " + returnedAmount);
					System.out.println("Thank You");
					total = 0;

				} else {
					System.out.println("Thank You");
				}
				System.exit(0);
				break;
			default:
				break;

			}
			System.out.println("1.Inventory item list.\n2.Purchase\n3.Exit");
			System.out.print("Enter your choice:");
			choice = sc.nextInt();
		}
	}

	public static void main(String[] args) {
		vendingMachine();
	}
}
