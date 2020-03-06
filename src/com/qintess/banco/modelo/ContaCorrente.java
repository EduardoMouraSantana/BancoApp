package com.qintess.banco.modelo;

public class ContaCorrente extends Conta{

	public ContaCorrente(int _agencia, int _numero, double _saldo,
			Cliente _cliente, double limite) {
		super(_agencia, _numero, _saldo + limite, _cliente);
		
	}
	public void setSaldo(double saldo) {
		super.setSaldo(saldo + this.limite);
	}
	
	private double creditoespecial=0;
	private double limite;

	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getCreditoEspecial() {
		return creditoespecial;
	}
	public void setCreditoEspecial(double valortaxa) {
		this.creditoespecial = valortaxa;
	}
	
	public void sacarDinheiro(double valor) {
		if(valor<=getSaldo())
			if(valor>300)
				System.out.println("Só é possível sacar até R$300,00");
			else{
				if(valor>getSaldo()-limite){
					setCreditoEspecial(valor-getSaldo());
					limite -= creditoespecial;
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
	
	public void depositarDinheiro(double valor) {
		if(creditoespecial==0)
			super.depositarDinheiro(valor);
		else {
			if(valor>creditoespecial) {
				double valorReal;
				limite += creditoespecial;
				valorReal = valor-creditoespecial;
				creditoespecial = 0;
			 
				setSaldo(valorReal);
			}
			else if(creditoespecial==valor) {
				limite += creditoespecial;
				creditoespecial = 0;
				
			}
			else{
				creditoespecial -= valor;	
				limite -= creditoespecial;
			}
			
		}
	}
		
	

}
