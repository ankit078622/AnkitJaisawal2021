package org.espire.service;

import java.util.Iterator;
import java.util.Scanner;

import ore.espire.entity.Inventory;
import ore.espire.entity.Product;

public class InventoryService extends Inventory {

	Product product = new Product();
	/**
	 * method is for displaying the item present in the inventory
	 */
	public void inventoryList() {
		Iterator<Integer> itemIterator = getInventory().keySet().iterator();
		System.out.println("Serial Number \t Product Name \t Product Price \t Quantity");
		while (itemIterator.hasNext()) {
			Integer key = itemIterator.next();
			Product value = getInventory().get(key);
			System.out.println(key + " \t\t " + value.getItemName() + " \t\t " + value.getItemPrice() + " \t\t "
					+ value.getQuantity());
		}
	}

	/**
	 * By default these items are present in inventory. This method is called when
	 * program statrs
	 */
	public void addProductToInventory() {
		addItemToInventory(1, new Product("COCK", 50, 20));
		addItemToInventory(2, new Product("PEPSI", 90, 20));
		addItemToInventory(3, new Product("CHIPS", 20, 20));
		addItemToInventory(4, new Product("5STAR", 10, 20));
	}

	/**
	 * When choice entered 1 then it will add product details to inventory
	 */
	public void addInventoryProductByOption() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the product name : ");
		product.setItemName(sc.next());
		System.out.print("Enter the item price : ");
		product.setItemPrice(sc.nextInt());
		System.out.print("Enter the quantity :");
		product.setQuantity(sc.nextInt());
		Integer key = 0;
		Iterator<Integer> itemIterator = getInventory().keySet().iterator();
		while (itemIterator.hasNext()) {
			key = itemIterator.next();
			Product value = getInventory().get(key);
		}
		addItemToInventory(key + 1, new Product(product.getItemName(), product.getItemPrice(), product.getQuantity()));
	}

	/**
	 * Method to madeChnges in inventory
	 */
	public void inventoryChanges() {
		/**
		 * Option displaying on console
		 */
		Integer choice, productId;
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"1.Add product to inventory\n2.Update inventory product details.\n3.Remove product from inventory\n4.Exit");
		System.out.print("Enter your choice : ");
		choice = scanner.nextInt();
		/**
		 * while loop for displaying the option's on the screen again and again
		 */
		while (choice < 4 && choice > 0) {
			switch (choice) {

			case 1:
				addInventoryProductByOption();
				break;

			/**
			 * Case 2 is for updating the item present in the inventory
			 */
			case 2:
				System.out.print("Enter the productId on which you want to update the details : ");
				productId = scanner.nextInt();
				updateInventory(productId);

				break;

			/**
			 * case 3 is for remove product from inventory record of sold item
			 */
			case 3:
				System.out.println("Enter the productId you want to remove : ");
				productId = scanner.nextInt();
				removeItemToInventory(productId);
				break;

			/**
			 * case 4 is used to exit from inventory
			 */
			case 4:
				break;
			default:
				break;

			}
			System.out.println(
					"1.Add product to inventory\n2.Update inventory product details.\n3.Remove product from inventory\n4.Exit");
			System.out.print("Enter your choice : ");
			choice = scanner.nextInt();
		}
	}

	/**
	 * Method to update the inventory this method called inside the
	 * inventoryChanges() method
	 */
	public void updateInventory(Integer productId) {
		/**
		 * security password
		 */

		/**
		 * while loop for displaying the option's on the screen again and again
		 */
		Integer choice;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Change product name\n2.Change product price.\n3.Changes product quantity\n4.Exit");
		System.out.print("Enter your choice : ");
		choice = scanner.nextInt();
		while (choice < 4 && choice > 0) {
			Integer key = 0;
			Product productValue = null;
			Iterator<Integer> itemIterator = getInventory().keySet().iterator();
			while (itemIterator.hasNext()) {
				key = itemIterator.next();
				// Product value = getInventory().get(key);
				if (productId == key) {
					productValue = getInventory().get(key);
				}
			}
			switch (choice) {
			/**
			 * case 1 is for update the present product name of corresponding productId
			 */
			case 1:
				System.out.println("Enter new product name : ");
				String productName = scanner.next();

				updateItemToInventory(productId, new Product(productName.toUpperCase(), productValue.getItemPrice(),
						productValue.getQuantity()));
				break;
			/**
			 * case 2 is for update the present product price of corresponding productId
			 */
			case 2:
				System.out.println("Enter new product price : ");
				Integer productPrice = scanner.nextInt();

				updateItemToInventory(productId,
						new Product(productValue.getItemName(), productPrice, productValue.getQuantity()));
				break;

			/**
			 * case 3 is for update the present product quantaity of corresponding productId
			 */
			case 3:
				System.out.println("Enter new product quantity : ");
				Integer productQuantity = scanner.nextInt();

				updateItemToInventory(productId,
						new Product(productValue.getItemName(), productValue.getItemPrice(), productQuantity));
				break;

			/**
			 * case 4 is used to exit from the update inventory option
			 */
			case 4:
				break;
			default:
				break;

			}
			System.out.println("1.Change product name\n2.Change product price.\n3.Changes product quantity\n4.Exit");
			System.out.print("Enter your choice : ");
			choice = scanner.nextInt();
		}
	}

}
