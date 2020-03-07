package com.qintess.banco.modelo;

import java.io.ObjectInputStream.GetField;

public class BancoApp {
	public static void main (String[]args){
		Cliente cliente = new Cliente("Joao", 1212125, 1231231232);
		Cliente cliente2 = new Cliente("Bruno", 1212123, 1231231233);
		// cria uma conta corrente
		ContaCorrente contacorrente2 = new ContaCorrente(1234, 568, 200, cliente2, 500);
		// cria uma conta poupanca
		ContaPoupanca contapoupanca = new ContaPoupanca(1235, 555, 3000, cliente);
		// cria uma conta corrente
		ContaCorrente contacorrente = new ContaCorrente(1234, 567, 5000, cliente, 500);
		// deposita dinheiro na conta
		/*contacorrente.depositarDinheiro(500);
		System.out.println(contacorrente.pegarSaldo());
		contacorrente.depositarDinheiro(500);
		System.out.println(contacorrente.pegarSaldo());*/
		
		// transfere dinheiro de uma conta remetente para uma destinatário
		/*contacorrente.transferir(contacorrente, contapoupanca, 500);
		System.out.println(contacorrente.pegarSaldo());
		System.out.println(contapoupanca.pegarSaldo());*/
		
		// sacar dinheiro da conta corrente
		/*contacorrente.sacarDinheiro(500); // erro no saque
		contacorrente.sacarDinheiro(300); 
		System.out.println(contacorrente.pegarSaldo());*/ 
		
		//sacar dinheiro da conta poupança 
		/*contapoupanca.sacarDinheiro(500);
		System.out.println(contapoupanca.pegarSaldo());*/
		
		//sacar do crédito especial
		
		System.out.println(contacorrente2.getLimite());
		contacorrente2.sacarDinheiro(300);
		System.out.println(contacorrente2.getLimite() + " " + contacorrente2.getCreditoEspecial());
	}
}
