package muk.spring.mvc.beans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

public class Order {
	
	@NotBlank(message="{productError}")
	private String productName;
	@Min(value=1,message="{minQuantity}")
	@Max(value=10,message="{maxQuantity}")
	private int quantity;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
