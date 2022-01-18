package ore.espire.entity;

import java.util.HashMap;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Data
public class Inventory {

	@Getter
	@Setter
	private Integer productId;

	// Keep the record of product which is available
	@NonNull
	HashMap<Integer, Product> inventoryMap = new HashMap<>();

	public Integer length() {
		return inventoryMap.size();
	}

	public HashMap<Integer, Product> getInventory() {
		return inventoryMap;
	}

	public void addItemToInventory(Integer productId, Product product) {
		this.inventoryMap.put(productId, product);
	}
	
	public void updateItemToInventory(Integer productId,Product newValue) {
		inventoryMap.replace(productId, newValue);	
	}
	
	public Product removeItemToInventory(Integer productId) {
		return inventoryMap.remove(productId);
	}
}
