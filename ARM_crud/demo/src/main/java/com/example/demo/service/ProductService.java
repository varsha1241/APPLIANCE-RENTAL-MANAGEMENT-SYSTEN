package com.example.demo.service;
import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import com.example.demo.entity.Product;
public interface ProductService 
{
	Product saveProduct(Product product);
	List<Product> getAllProducts();
	ResponseEntity<List<Product>> getProductByVendorid(Long id);
	ResponseEntity<Product>getProductByproductId(Long id);
	ResponseEntity<Map<String, Boolean>> deleteProductById(Long id);
	ResponseEntity<Product> updateProductById(Long id, Product product);
}
