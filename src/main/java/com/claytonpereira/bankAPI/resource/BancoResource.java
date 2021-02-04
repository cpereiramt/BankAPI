package com.claytonpereira.bankAPI.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claytonpereira.bankAPI.model.Banco;;

@RestController
@RequestMapping("/teste")
public class BancoResource {
   
	@GetMapping
	public Banco getClients() {
		return new Banco("CLAYTON PEREIRA");
	}
}

