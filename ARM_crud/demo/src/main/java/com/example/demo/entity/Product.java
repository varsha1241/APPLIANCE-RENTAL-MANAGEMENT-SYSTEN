package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long productId;
	private String productName;
	private Long vendorid;
	private String productDescription;
	private String productAmount;
	private String productRentalTime;
	private String productCategory;
	private String Location;
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(String productAmount) {
		this.productAmount = productAmount;
	}
	public String getProductRentalTime() {
		return productRentalTime;
	}
	public void setProductRentalTime(String productRentalTime) {
		this.productRentalTime = productRentalTime;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public Product(Long productId,Long vendorid, String productName, String productDescription,
			String productAmount, String productRentalTime, String productCategory, String location) {
		super();
		this.vendorid=vendorid;
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productAmount = productAmount;
		this.productRentalTime = productRentalTime;
		this.productCategory = productCategory;
		Location = location;
	}
	public Product() {
	

	}
	
	
	public Long getVendorid() {
		return vendorid;
	}
	public void setVendorid(Long vendorid) {
		this.vendorid = vendorid;
	}

	
}
