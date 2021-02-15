package com.claytonpereira.bankAPI.service;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.claytonpereira.bankAPI.model.Banco;


@Service
public class BancoService {
    boolean estaoOsDadosCorretos = false;
	public BancoService() {

	}	
	List <Banco> bancoList = new ArrayList<Banco>();
	
	
	public String adicionaClienteService( String bancoName,
			                           String contaNumero,
			                            String agenciaNumero,
			                            String saldoParaDeposito,
			                            String nome,
			                           String sexo,
			                           String telefone) 
	{  	
		
		String result = verificaDados(bancoName, 
				      contaNumero, 
				      agenciaNumero, 
				      saldoParaDeposito, 
				      nome);
		
		if (estaoOsDadosCorretos) {
			
			 Banco banco = new Banco();
		     banco.setBancoName(bancoName);
		     banco.setContaNumero(contaNumero);
		     banco.setAgenciaNumero(agenciaNumero);
		     banco.setSaldoParaDeposito(saldoParaDeposito);
		     banco.getCliente().setNome(nome);
		     banco.getCliente().setSexo(sexo);
		     banco.getCliente().setTelefone(telefone);
		     this.bancoList.add(banco);
		     return result;
		}
		else {
			return result;
		}
		
} 
	
	public List<Banco> getBanco() {
		return this.bancoList;
		
	}
	
	
	public String deletaCliente(int index) {
		try {
			bancoList.remove(index);
		} catch(Exception exception) {
			System.out.print(exception);
			return "não existe cliente registrado nessa posição do Array !";
		}		
		return "cliente removido com sucesso !";		
	}

	private String verificaDados(String bancoName, String contaNumero, String agenciaNumero, String saldoParaDeposito,
			String nome) {
		if (Integer.parseInt(saldoParaDeposito) <= 0) {
			estaoOsDadosCorretos = false;
			return "saldo invalido, favor digitar um valor"
					+ "maior que Zero";
			
		} 
		else if(bancoName.isEmpty()) {
			estaoOsDadosCorretos = false;
		   return "Nome do banco inválido, nome não pode ser"
		   		+ " vazio";	
		}
		else if(contaNumero.isEmpty()) {
			estaoOsDadosCorretos = false;
			 return "Numero da conta inválido, numero não pode ser"
				   		+ " vazio";	
		}
		
		else if(agenciaNumero.isEmpty()) {
			estaoOsDadosCorretos = false;
			 return "Numero da agencia inválido, numero não pode ser"
				   		+ " vazio";	
		}
		
		else if(nome.isEmpty()) {
			estaoOsDadosCorretos = false;
			 return "nome do cliente inválido, nome não pode ser"
				   		+ " vazio";	
		}
		estaoOsDadosCorretos = true;
		return "Cliente inserido com sucesso no Banco";
		
	}
}
