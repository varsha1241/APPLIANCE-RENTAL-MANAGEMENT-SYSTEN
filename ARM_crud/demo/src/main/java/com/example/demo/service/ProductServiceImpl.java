package com.example.demo.service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.controller.ProductController;
import com.example.demo.entity.Product;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	Logger logger=LoggerFactory.getLogger(ProductController.class);
	
	@Override
	public Product saveProduct(Product product) 
	{

		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() 
	{
		logger.info("In product service - getAllProducts");
		return productRepository.findAll();
	}

	@Override
	public ResponseEntity<List<Product>> getProductByVendorid(Long vendorId) 
	{
		List<Product> products = productRepository.findAllByVendorid(vendorId);
		return ResponseEntity.ok(products);
	}

	@Override
	public ResponseEntity<Product> getProductByproductId(Long productId) 
	{
		Product product=productRepository.findById(productId).orElseThrow(()->
        new ResourceNotFoundException("Product does not exist with productId:"+productId));
        return ResponseEntity.ok(product);
	}
	@Override
	public ResponseEntity<Map<String, Boolean>> deleteProductById(Long productId) 
	{
		Product product=productRepository.findById(productId).orElseThrow(()->
		new ResourceNotFoundException("Product does not exist with productId:"+productId));
		
		productRepository.delete(product);
		Map<String,Boolean> response=new HashMap<>();
		response.put("deleted",Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	@Override
	public ResponseEntity<Product> updateProductById(Long productId, Product product) {
		Product products=productRepository.findById(productId).orElseThrow(()->
		new ResourceNotFoundException("Product does not exist with productId:"+productId));
		products.setProductId(product.getProductId());
		products.setProductName(product.getProductName());
		products.setProductDescription(product.getProductDescription());
		products.setProductAmount(product.getProductAmount());
		products.setProductRentalTime(product.getProductRentalTime());
		products.setProductCategory(product.getProductCategory());
		products.setLocation(product.getLocation());
		Product updatedProduct=productRepository.save(product);
		return ResponseEntity.ok(product);
	}

}

