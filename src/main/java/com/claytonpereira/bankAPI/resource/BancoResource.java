package com.claytonpereira.bankAPI.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claytonpereira.bankAPI.model.Banco;
import com.claytonpereira.bankAPI.service.BancoService;

@RestController
@RequestMapping("/cliente")
public class BancoResource {
	
	@Autowired
	BancoService bancoService;
	 
	
	@GetMapping
	public List <Banco> getClients() {
		return bancoService.getBanco();
	}
	
	
	@PostMapping
	public String insertClient(@RequestBody Banco request) {	     
		String result = bancoService.adicionaClienteService(request.getBancoName(), 
				request.getContaNumero(), 
				request.getAgenciaNumero(), 
				request.getSaldoParaDeposito(), 
				request.getCliente().getNome(), 
				request.getCliente().getSexo(), 
				request.getCliente().getTelefone());
		  
		  return result;
	         
	}
	
	@DeleteMapping("/{contaNumero}")
	public String DeleteClient(@PathVariable int contaNumero) {
		String result = bancoService.deletaCliente(contaNumero);
		return result;
		
	}
}

