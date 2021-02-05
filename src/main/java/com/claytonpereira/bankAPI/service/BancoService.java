package com.claytonpereira.bankAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claytonpereira.bankAPI.model.Banco;


@Service
public class BancoService {
    Banco banco;
	public BancoService() {
	 banco = new Banco();
	}
	
	public String adicionaClienteService( String bancoName,
			                           String contaNumero,
			                            String agenciaNumero,
			                            String saldoParaDeposito,
			                            String nome,
			                           String sexo,
			                           String telefone) 
	{ 
		
	     
	     banco.setBancoName(bancoName);
	     banco.setContaNumero(contaNumero);
	     banco.setAgenciaNumero(agenciaNumero);
	     banco.setSaldoParaDeposito(saldoParaDeposito);
	     banco.getCliente().setNome(nome);
	     banco.getCliente().setSexo(sexo);
	     banco.getCliente().setTelefone(telefone);
	    
	
	
	return "O cliente foi cadastrado com sucesso !";
	}
}
