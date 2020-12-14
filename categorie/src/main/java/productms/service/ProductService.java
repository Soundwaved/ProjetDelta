package productms.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import productms.dto.ProductR;
import productms.dto.ProductTransformer;
import model.Product;
import repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductTransformer productTransformer;
	
	public ProductR getProduct(int id) {
		Product product = productRepository.findById(id).get();		
		ProductR productR = productTransformer.transform(product);		
		return productR;
	}
	
	public Iterable<ProductR> getProducts() {
		
		Iterable<Product> products = productRepository.findAll();
		ArrayList<ProductR> productRs = new ArrayList<ProductR>();
		
		Iterator<Product> iterator = products.iterator();
		while(iterator.hasNext()) {
			Product p = iterator.next();
			ProductR productR = productTransformer.transform(p);
			productRs.add(productR);
		}
		return productRs;		
	}
	
	
}
