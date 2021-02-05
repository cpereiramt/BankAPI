package com.claytonpereira.bankAPI.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claytonpereira.bankAPI.model.Cliente;

@RestController
public class clienteResource {
   
	@RequestMapping(path = "/")
	public Cliente getClients() {
		Cliente clientes = new Cliente();
		return clientes ;
	}
}
