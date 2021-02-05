package com.claytonpereira.bankAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claytonpereira.bankAPI.model.Banco;


@Service
public class BancoService {
   
	public BancoService() {

	}
	
	public String adicionaClienteService( String bancoName,
			                           String contaNumero,
			                            String agenciaNumero,
			                            String saldoParaDeposito,
			                            String nome,
			                           String sexo,
			                           String telefone) 
	{ 
		 Banco banco = new Banco();
	     
	     banco.setBancoName(bancoName);
	     banco.setContaNumero(contaNumero);
	     banco.setAgenciaNumero(agenciaNumero);
	     banco.setSaldoParaDeposito(saldoParaDeposito);
	     banco.getCliente().setNome(nome);
	     banco.getCliente().setSexo(sexo);
	     banco.getCliente().setTelefone(telefone);
	     
	    System.out.println(banco.getCliente().getNome());
	    
	
	
	return "O cliente foi cadastrado com sucesso !";
	}
}
