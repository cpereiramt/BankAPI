package com.claytonpereira.bankAPI.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claytonpereira.bankAPI.model.Banco;
import com.claytonpereira.bankAPI.service.BancoService;

@RestController
@RequestMapping("/cadastrarCliente")
public class BancoResource {
	
	@Autowired
	BancoService bancoService;
	 List <Banco> banco = new ArrayList<Banco>();	
	
	@GetMapping
	public List <Banco> getClients() {
		return banco;
	}
	
	
	@PostMapping
	public List <Banco> insertClient(@RequestBody Banco request) {	     
		banco.add(request);
		System.out.println(request);
		
		/*
		 * 
		 * banco.setBancoName(request.getBancoName());
		 * banco.setContaNumero(request.getContaNumero());
		 * banco.setAgenciaNumero(request.getAgenciaNumero());
		 * banco.setSaldoParaDeposito(request.getSaldoParaDeposito());
		 * banco.getCliente().setNome(request.getCliente().getNome());
		 * banco.getCliente().setSexo(request.getCliente().getSexo());
		 * banco.getCliente().setTelefone(request.getCliente().getTelefone());
		 */
	     
		  
    return banco;     
	}
	
}

