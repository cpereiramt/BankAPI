package com.claytonpereira.bankAPI.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String contaNumero;
	private String agenciaNumero;
	
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
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
}
