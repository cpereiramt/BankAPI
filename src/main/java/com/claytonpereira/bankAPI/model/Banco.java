package com.claytonpereira.bankAPI.model;

import org.springframework.stereotype.Component;

@Component
public class Banco {
	
	private String bancoName;
	private String contaNumero;
	private String agenciaNumero;
	private String saldoParaDeposito;
	
	
	/*
	 * A cada banco criado, é criado um cliente também, 
	 * ou seja relacionamento de um para um .
	 */	
	private Cliente cliente = new Cliente();	 
	
    
	
	public String getBancoName() {
		return bancoName;
	}
	
	public void setBancoName(String bancoName) {
		this.bancoName = bancoName;
	}
	
		
	public String getContaNumero() {
		return contaNumero;
	}
	public void setContaNumero(String contaNumero) {
		this.contaNumero = contaNumero;
	}
	public String getAgenciaNumero() {
		return agenciaNumero;
	}
	public void setAgenciaNumero(String agenciaNumero) {
		this.agenciaNumero = agenciaNumero;
	}
	
	public String getSaldoParaDeposito() {
		return saldoParaDeposito;
	}

	public void setSaldoParaDeposito(String saldoParaDeposito2) {
		this.saldoParaDeposito = saldoParaDeposito2;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
