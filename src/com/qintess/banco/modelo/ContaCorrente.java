package com.qintess.banco.modelo;

public class ContaCorrente extends Conta{

	public ContaCorrente(int _agencia, int _numero, double _saldo,
			Cliente _cliente, double limite) {
		super(_agencia, _numero, _saldo + limite, _cliente);
		
	}
	public void setSaldo(double saldo) {
		super.setSaldo(saldo + this.limite);
	}
	
	private double valortaxa;
	private double limite;

	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getValortaxa() {
		return valortaxa;
	}
	public void setValortaxa(double valortaxa) {
		this.valortaxa = valortaxa;
	}
	
	public void sacarDinheiro(double valor) {
		if(valor<=getSaldo())
			if(valor>300)
				System.out.println("Só é possível sacar até R$300,00");
			else{
				if(valor>getSaldo()-limite){
					super.sacarDinheiro(valor);
					setSaldo(getSaldo()-2);
				}
				else{
					super.sacarDinheiro(valor);
					setSaldo(getSaldo()-0.3);
				}
					
			}
				
		else
			System.out.println("Esse valor não está disponível");
	}
		
	

}
