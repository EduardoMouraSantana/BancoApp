package com.qintess.banco.modelo;

public class Conta {
	private int agencia;
	private int numero;
	private double saldo;
	public double getSaldo() {
		return saldo;
	}

	private Cliente cliente;
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	public Conta(int _agencia, int _numero, double _saldo, Cliente _cliente){
		this.agencia = _agencia;
		this.numero = _numero;
		this.saldo = _saldo;
		this.cliente = _cliente;
	}
	
	public void depositarDinheiro(double valor){
		this.saldo = this.saldo + valor;
	}
	public void sacarDinheiro(double valor){
		if(this.saldo >= valor) {
			this.saldo = this.saldo-valor;
			System.out.println("Retire seu dinheiro");
		}
		else {
			System.out.print("Esse valor não está disponível");
		}
	}
	
	public String pegarSaldo(){
		String saldo = Double.toString(this.saldo);
		return saldo;
	}
	
	public void transferir(Conta remetente, Conta destinatario, int valor) {
		System.out.println("Existe uma taxa de R$4 para realizar transferências");
		if(remetente.getSaldo()>=valor+4) {
			destinatario.setSaldo(destinatario.getSaldo()+valor);
			remetente.setSaldo(remetente.getSaldo()-valor-4);
		}
		else 
			System.out.println("Não é possível transferir esse valor");
	}
	
	
}

