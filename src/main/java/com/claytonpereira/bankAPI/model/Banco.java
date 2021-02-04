package com.claytonpereira.bankAPI.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String bancoName;
	private String contaNumero;
	private String agenciaNumero;
	private double saldoParaDeposito;
	
	public Banco(String bancoName)
	{
	   
		
		this.bancoName = bancoName;
	
	  	
	}
	 
	public String getBancoName() {
		return bancoName;
	}

	public void setBancoName(String bancoName) {
		this.bancoName = bancoName;
	}
	
	
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(String nome, char sexo, String telefone) {
		this.clientes.add(new Cliente(nome,sexo, telefone));
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
	
	public double getSaldoParaDeposito() {
		return saldoParaDeposito;
	}

	public void setSaldoParaDeposito(double saldoParaDeposito) {
		this.saldoParaDeposito = saldoParaDeposito;
	}
}
