package com.fetchr.red;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/save")
public class ClientRestController 
{
	@Autowired
	private ClientRepository repo;
	
	@RequestMapping (method= RequestMethod.GET)
	public List <Client> getAll() 
	{
		return repo.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody Client client)
	{
		 repo.save(client);
		
		return ResponseEntity.ok("Created");
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="{id}")
	public ResponseEntity<?> update(@PathVariable String id, @RequestBody Client client)
	{
		Client update = repo.findOne(id);
		update.setClientWebHookUrl(client.getClientWebHookUrl());
		update.setEmail(client.getEmail());
		update.setSMS(client.getSMS());
		update.setSU1(client.getSU1());
		update.setSU2(client.getSU2());
		update.setSU3(client.getSU3());
		update.setSU4(client.getSU4());
		update.setSU5(client.getSU5());
		update.setSU6(client.getSU6());
		update.setSU7(client.getSU7());
		update.setSU8(client.getSU8());
		update.setSU9(client.getSU9());
		update.setSU11(client.getSU11());
		update.setSU10(client.getSU10());
		update.setSU12(client.getSU12());
		update.setSU13(client.getSU13());
		update.setSU14(client.getSU14());
		update.setSU15(client.getSU15());
		update.setSU16(client.getSU16());
		update.setSU17(client.getSU17());
		


		return ResponseEntity.ok("Updated");
		//return repo.save(update);
	}

}
