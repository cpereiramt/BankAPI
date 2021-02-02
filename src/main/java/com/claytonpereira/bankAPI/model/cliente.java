package com.claytonpereira.bankAPI.model;

public class Cliente {

	private String nome;
	private char sexo;
	private String telefone;
 
	
	
	public Cliente(String nome, char sexo,
     String telefone) {
		this.nome = nome;
		this.sexo = sexo;
		this.telefone = telefone;
	
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

   
}
