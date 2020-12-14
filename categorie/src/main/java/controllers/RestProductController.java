package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import productms.dto.ProductR;
import productms.service.ProductService;

@RestController
public class RestProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/product/{id}")
	public ProductR getProduct(@PathVariable("id") int id) {
		return productService.getProduct(id);
	}
	
	@GetMapping("/product")
	public Iterable<ProductR> getProducts() {
		return productService.getProducts();
	}
	
}
