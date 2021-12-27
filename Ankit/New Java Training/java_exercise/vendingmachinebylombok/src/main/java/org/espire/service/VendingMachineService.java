package org.espire.service;

import java.util.Scanner;

public class VendingMachineService {

	public void vendingMachineService() {

		/**
		 * Creating the object of Bucket and Inventory class
		 */
		InventoryService inventoryObj = new InventoryService();
		BucketService bucketService = new BucketService();

		/**
		 * Adding some items to inventory
		 */
		inventoryObj.addProductToInventory();

		/**
		 * Option displaying on console
		 */
		System.out.println("1.Inventory\n2.Inventory item list.\n3.Purchase Product\n4.Exit");
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
		while (choice <= 4 && choice > 0) {
			switch (choice) {

			/**
			 * Case 1 is for add product details to inventory
			 */
			case 1:
				inventoryObj.inventoryChanges();
				break;
			/**
			 * Case 2 is for displaying the item present in the inventory
			 */
			case 2:
				inventoryObj.inventoryList();
				break;

			/**
			 * case 3 is for purchasing the item. it uses the Bucket class for storing the
			 * record of sold item
			 */
			case 3:
				bucketService.bucketChanges(inventoryObj);
				break;

			/**
			 * case 4 is used to display the bucket list and the total amount
			 */
			case 4:
				System.exit(0);
				break;
			default:
				break;

			}
			System.out.println("1.Inventory\n2.Inventory item list.\n3.Purchase Product\n4.Exit");
			System.out.print("Enter your choice:");
			choice = sc.nextInt();
		}
	}

}
