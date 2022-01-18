package org.espire.service;

import java.util.Iterator;
import java.util.Scanner;

import ore.espire.entity.Bucket;
import ore.espire.entity.Product;

public class BucketService extends Bucket {

	Product product = new Product();
	Scanner scanner = new Scanner(System.in);
	// Bucket bucket;

	/**
	 * Declaring variables
	 */
	String selectedItem = "";
	Integer quantity = 0, selectedItemPrice = 0, count = 0;
	Integer caculate = 0, total = 0, discountCount = 0;
	Float returnedAmount = 0.0f, insertedCoin = 0.0f;

	public void inventoryList(InventoryService inventoryService) {
		Iterator<Integer> itemIterator = inventoryService.getInventory().keySet().iterator();
		System.out.println("Serial Number \t Product Name \t Product Price \t Quantity");
		while (itemIterator.hasNext()) {
			Integer key = itemIterator.next();
			Product value = inventoryService.getInventory().get(key);
			System.out.println(key + " \t\t " + value.getItemName() + " \t\t " + value.getItemPrice() + " \t\t "
					+ value.getQuantity());
		}
	}

	/**
	 * method is for displaying the item present in the inventory
	 */
	public void bucketList() {
		Iterator<Integer> itemBucket = getBucket().keySet().iterator();
		System.out.println("Serial Number \t Product Name \t Product Price \t Quantity \t Sum");

		/**
		 * This loop print list of item present in the bucket for cureent session
		 */
		while (itemBucket.hasNext()) {
			Integer key = itemBucket.next();
			Product value = getBucket().get(key);
			caculate = (int) (value.getItemPrice() * value.getQuantity());
			total = total + caculate;
			System.out.println(key + " \t\t " + value.getItemName() + " \t\t " + value.getItemPrice() + " \t\t "
					+ value.getQuantity() + " \t\t " + caculate);
			if ((value.getItemName().equals("CHIPS") && value.getQuantity() == 5)
					|| (value.getItemName().equals("COCK") && value.getQuantity() == 5)) {
				discountCount++;
			}
		}
	}

	/**
	 * When choice entered 1 then it will add product details to bucket Method for
	 * purchase the product
	 */
	public void addBucket(InventoryService inventoryService) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the item name : ");
		selectedItem = sc.next();
		Iterator<Integer> itemIterator1 = inventoryService.getInventory().keySet().iterator();
		while (itemIterator1.hasNext()) {
			Integer key = itemIterator1.next();
			Product value = inventoryService.getInventory().get(key);
			if (selectedItem.toUpperCase().equals(value.getItemName())) {
				selectedItemPrice = (int) value.getItemPrice();
				System.out.println("Remember quantity must be less then 5 \nProduct present in inventory is : "
						+ value.getQuantity());
				System.out.print("Enter the quantity : ");
				quantity = sc.nextInt();
				while (value.getQuantity() < quantity || quantity > 5) {
					System.out.println(
							"Remember quantity must be less then 5 or eaqual to 5. You have entered the wrong quantity please enter the quantity again : ");
					quantity = sc.nextInt();
				}
				count = count + 1;
				addItemToBucket(count, new Product(selectedItem.toUpperCase(), selectedItemPrice, quantity));
				System.out.println("Entered item price is : " + selectedItemPrice);
			}
		}
	}

	/**
	 * Method to madeChnges in inventory
	 */
	public void bucketChanges(InventoryService inventoryService) {
		// inventoryService.addProductToInventory();
		/**
		 * Option displaying on console
		 */
		Integer choice, productId;

		System.out.println("1.Purchase\n2.Bucket product list.\n3.Remove product from bucket\n4.Exit");
		System.out.print("Enter your choice : ");
		choice = scanner.nextInt();
		/**
		 * while loop for displaying the option's on the screen again and again
		 */
		while (choice <= 4 && choice > 0) {
			switch (choice) {

			case 1:
				addBucket(inventoryService);
				break;

			/**
			 * Case 2 is for displaying the item present in the bucket
			 */
			case 2:
				if (length() > 0) {
					bucketList();
				} else {
					System.out.println("Your bucket is empty:");
				}
				total = 0;
				discountCount = 0;
				break;

			/**
			 * case 3 is for remove product from bucket record of sold item
			 */
			case 3:
				System.out.println("Enter the productId you want to remove : ");
				productId = scanner.nextInt();
				removeItemBucket(productId);
				break;

			/**
			 * case 4 is used to exit from bucket
			 */
			case 4:
				if (length() > 0) {
					bucketList();
					/**
					 * It checks the chips and pepsi quantity is 5 or not If quantity is 5 the 20%
					 * discount will be calculated
					 */
					if (discountCount == 2) {
						System.out.println("Congrutulations you will get 20 % discount.");
						System.out.print("Total amount : " + (total - ((float) total * 0.2)));
						System.out.print("\nInserted coin value : ");
						insertedCoin = scanner.nextFloat();
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
						insertedCoin = scanner.nextFloat();
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
			System.out.println("1.Purchase\n2.Bucket product list.\n3.Remove product from bucket\n4.Exit");
			System.out.print("Enter your choice : ");
			choice = scanner.nextInt();
		}
	}

}
