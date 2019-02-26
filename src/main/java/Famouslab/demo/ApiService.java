package Famouslab.demo;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import Famouslab.demo.model.Complete;
import Famouslab.demo.model.CompleteResponse;
import Famouslab.demo.model.Tiny;
import Famouslab.demo.model.TinyResponse;

@Component
public class ApiService {

	private RestTemplate restTemplate = new RestTemplate();

	public List<Tiny> getTinyResponse() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		TinyResponse response = restTemplate.getForObject(url, TinyResponse.class);
		System.out.println(response);
		return response.getTiny();	
	}
	public List<Complete> getCompleteResponse() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		CompleteResponse response = restTemplate.getForObject(url, CompleteResponse.class);
		System.out.println(response);
		return response.getComplete();	
	}
}
