package com.qintess.banco.modelo;

public class Cliente{
	private String nome;
	private int cpf;
	private int rg;
	
	public Cliente(String _nome, int _cpf, int _rg) {
		this.nome = _nome;
		this.cpf = _cpf;
		this.rg = _rg;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	
}
