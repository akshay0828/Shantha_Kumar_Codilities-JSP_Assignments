package com.valtech.ac.facade;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.valtech.ac.model.TxModel;

@Component
public class TxFacade {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${tx.url}")
	private String txUrl;
	
	public List<TxModel> getTxsForAccounts(long accId){
	return	Arrays.asList(restTemplate.getForEntity("http://localhost:9091/api/txs/accounts/"+accId, TxModel[].class).getBody());
		
	}

}
