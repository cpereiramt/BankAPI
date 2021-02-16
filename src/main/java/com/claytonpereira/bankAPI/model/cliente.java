package com.claytonpereira.bankAPI.model;

import org.springframework.stereotype.Component;


@Component
public class Cliente {
	private String nome;
	private String sexo;
	private String telefone;
 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

   
}
