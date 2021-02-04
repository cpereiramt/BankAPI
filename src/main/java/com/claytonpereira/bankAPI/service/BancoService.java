package com.claytonpereira.bankAPI.service;

import org.springframework.stereotype.Service;

import com.claytonpereira.bankAPI.model.Banco;


@Service
public class BancoService {

	Banco banco;
	public BancoService() {
		banco  =  new Banco("Banco estatal chines");	
	}
	
	
	public String adicionaClienteService(String contaNumero,
			                           String agenciaNumero,
	                                   double saldoParaDeposito,
	                                   String nome,
	                                   char sexo,
	                                   String telefone) 
	{
	     if(saldoParaDeposito <= 0 ) {
	    	 return "Não é possivel fazer um deposito sem o valor";
	     }
	     
	    banco.setClientes(nome, sexo, telefone); 
		return banco.getClientes().toString();
	}
	
}
