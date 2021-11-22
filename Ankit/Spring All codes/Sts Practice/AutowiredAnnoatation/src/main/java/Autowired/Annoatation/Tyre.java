package Autowired.Annoatation;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

	private String brand;
	@Override
	public String toString() {
		return "Its working";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
