package com.claytonpereira.bankAPI.resource;

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

/* a anotação @RestController, informar para o Spring 
 * que essa classe serve como controlador de 
 * um recurso ("resource") da nossa aplicação .
*/
@RestController

/*
 * @RequestMapping vincula uma url a uma classe ou função .
 */
@RequestMapping("/cliente")
public class BancoResource {
	
	/* @Autowired é utilizado para injeção de dependências
	 * ou seja estamos informando ao spring para que ele 
	 * gerencie o ciclo de vida da instancia de bancoService
	 * mas essa anotação só funciona em componentes do spring
	 * pro exemplo(@Service, @RestController, @controller, etc)
	 */
	@Autowired
	BancoService bancoService;	 
	
	/*
	 * mapeia a função ao verbo Http GET
	 */
	@GetMapping
	public List <Banco> getClients() {
		return bancoService.getBanco();
	}
	
	/*
	 * mapeia a função ao verbo Http POST
	 */
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
	
	/*
	 * mapeia a função ao verbo Http Delete
	 */
	@DeleteMapping("/{contaNumero}")
	public String DeleteClient(@PathVariable int contaNumero) {
		String result = bancoService.deletaCliente(contaNumero);
		return result;
		
	}
}

