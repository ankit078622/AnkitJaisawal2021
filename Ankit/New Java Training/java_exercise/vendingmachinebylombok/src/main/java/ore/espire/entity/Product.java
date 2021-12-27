package ore.espire.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	/**
	 * Getter and Setter annotation is for creating the getter and setter method
	 */
	@Getter 
	@Setter
	private String itemName;
	
	@Getter 
	@Setter
	private Integer itemPrice;
	
	@Getter 
	@Setter
	private Integer quantity;

}
