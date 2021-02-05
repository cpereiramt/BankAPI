package com.claytonpereira.bankAPI.resource;

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
	
	BancoService bancoService = new BancoService();
	Banco banco;
	
	public BancoResource() {
	 banco = new Banco();	
	}
	
	@GetMapping
	public Banco getClients() {
		return banco;
	}
	
	
	@PostMapping
	public Banco insertClient(@RequestBody Banco request) {	     
		
		bancoService.adicionaClienteService( request.getBancoName(),
				request.getContaNumero(),
				request.getAgenciaNumero(),
				request.getSaldoParaDeposito(),
				request.getCliente().getNome(),
				request.getCliente().getSexo(),
				request.getCliente().getTelefone());
		  
    return banco;     
	}
	
}

