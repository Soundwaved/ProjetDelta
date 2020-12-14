package repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import config.CustomProperties;
import model.YUser;

@Repository
public class UserProxy {

	@Autowired
	public RestTemplate restTemplate;

	@Autowired
	private CustomProperties props;

	public YUser getUser(int id) {

		String getUserUrl = props.getApiUrl() + "/user/" + id;
		ResponseEntity<YUser> response = restTemplate.exchange(getUserUrl, HttpMethod.GET, null, YUser.class);
		return response.getBody();
	}

}
