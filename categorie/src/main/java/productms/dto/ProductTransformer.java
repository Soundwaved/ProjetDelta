package productms.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import model.Product;
import model.YUser;
import repositories.UserProxy;

@Component
public class ProductTransformer {

	@Autowired
	private UserProxy userProxy;
	
	public ProductR transform(Product p) {
		
		ProductR productR = new ProductR();
		productR.setId(p.getId());
		productR.setName(p.getName());		
		YUser user = userProxy.getUser(p.getIduser());
		productR.setUser(user);
		
		return productR;
	}
	
	
}
