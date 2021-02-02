package com.claytonpereira.bankAPI.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class clienteResource {
   
	@RequestMapping(path = "/")
	public String mensagem() {
		return "Index spring boot";
	}
}
