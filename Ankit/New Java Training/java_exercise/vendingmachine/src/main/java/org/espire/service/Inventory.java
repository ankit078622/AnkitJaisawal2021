package org.espire.service;

import java.util.HashMap;

import ore.espire.entity.Product;

public class Inventory {

	HashMap<Integer, Product> inventory = new HashMap<>();

	public Integer length() {
		return inventory.size();
	}

	public HashMap<Integer, Product> getInventory() {
		return inventory;
	}

	public void addItemToInventory(Integer productNumber, Product product) {
		this.inventory.put(productNumber, product);
	}

}
