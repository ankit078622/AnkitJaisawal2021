package entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="inventory_item")
public class InventoryItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer inventory_number;
	private String title;
	private Double price;
	
	@OneToMany(cascade = {CascadeType.ALL})
	@JoinColumn(name="orderid")
	@OrderColumn(name="type")
	private List<OrderItem> orderItemList;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getInventory_number() {
		return inventory_number;
	}
	public void setInventory_number(Integer inventory_number) {
		this.inventory_number = inventory_number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
