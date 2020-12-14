package productms.dto;

import model.YUser;

public class ProductR {

	private int id;
	
	private String name;
		
	private YUser user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public YUser getUser() {
		return user;
	}

	public void setUser(YUser user) {
		this.user = user;
	}
	
	
}