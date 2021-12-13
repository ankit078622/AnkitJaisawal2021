package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="order_item")
public class OrderItem {

	private Integer order_id;
	private Integer order_item;
	private Integer Quantity_item;
	
	
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Integer getOrder_item() {
		return order_item;
	}
	public void setOrder_item(Integer order_item) {
		this.order_item = order_item;
	}
	public Integer getQuantity_item() {
		return Quantity_item;
	}
	public void setQuantity_item(Integer quantity_item) {
		Quantity_item = quantity_item;
	}
	
}
