package ore.espire.entity;

import java.util.HashMap;

public class Bucket extends Inventory{
	HashMap<Integer, Product> bucketList = new HashMap<>();

	public Integer length() {
		return bucketList.size();
	}

	public HashMap<Integer, Product> getBucket() {
		return bucketList;
	}

	public void addItemToBucket(Integer productNumber, Product product) {
		this.bucketList.put(productNumber, product);
	}
	
	public void removeItemBucket(Integer productId) {
		bucketList.remove(productId);
	}
	
	
	
}
