package tn.iit.medical.service;

import java.util.List;


import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import tn.iit.medical.dto.ItemDto;

@Service
public class StoreManagementService {
	private final RestTemplate restTemplate;

	public StoreManagementService(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	
	
	public StoreManagementService() {
		this.restTemplate = new RestTemplate();
	}


	public List<ItemDto> getAllItemsDto(){
		UriComponents uriComponents = UriComponentsBuilder.fromUriString("http://storemanagement:8082/api/item").build().encode();	
		return restTemplate.exchange(uriComponents.toUri(), HttpMethod.GET, new HttpEntity<>(null, new HttpHeaders()),
				new ParameterizedTypeReference<List<ItemDto>>() {}).getBody();	
	}
	
	public ItemDto getItemById(Integer id) {
		UriComponents uriComponents = UriComponentsBuilder.fromUriString("http://storemanagement:8082/api/item")
				.path("/{id}").build().expand(id).encode();
		ResponseEntity<ItemDto> res = restTemplate.exchange(uriComponents.toUri(), HttpMethod.GET, new HttpEntity<>(null, new HttpHeaders()),
				ItemDto.class);
		return res.getBody();
	}
	

}
