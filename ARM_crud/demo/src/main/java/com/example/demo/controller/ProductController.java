package com.example.demo.controller;
import java.util.List;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.slf4j.Logger;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	Logger logger=LoggerFactory.getLogger(ProductController.class);
	
	@PostMapping
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@GetMapping
	public List<Product> getAllProducts(){
		logger.info("In Product controller -getAllProducts");
		return productService.getAllProducts();
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<List<Product>> getProductById(@PathVariable("id") Long id) 
	{
		return productService.getProductByVendorid(id);
	}
	
	@GetMapping("pro/{id}")
	public ResponseEntity<Product> getProductsById(@PathVariable("id") Long id) 
	{
		return productService.getProductByproductId(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteProductById(@PathVariable("id") Long id) {
		productService.deleteProductById(id);
		return "Product deleted Successfully";
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Product> updateProductById(@PathVariable("id") Long id, @RequestBody Product product) {
		return productService.updateProductById(id, product);
	}
}
