package accounts;

import banks.Agencia;
import clients.Titular;
import pix.Pix;

public class ContaPoupanca extends Conta{
	public ContaPoupanca(Agencia agencia, int codigo, Titular titular, double saldo) {
		super(agencia, codigo, titular, saldo);
	}
	public ContaPoupanca(Agencia agencia, int codigo, Titular titular) {
		super(agencia, codigo, titular);
	}
	@Override
	public boolean sacar(double valor) {
		if(valor <= saldo) {
			saldo = saldo - valor;
			return true;
		}
		else return false;
	}
	
	@Override
	public boolean depositar(double valor) {
		saldo = saldo + valor;
		return true;
	}
	
	@Override
	public boolean transferir(double valor, int codigo) {
		return true;
	}
	
	@Override
	public void exibirExtrato(int mes) {}
	
	@Override
	public void exibirSaldo() {}
	
	@Override
	public boolean cadastrarPix(Pix novoPix) {
		return true;
	}
	
	@Override
	public boolean pagarComPix(double valor) {
		return true;
	}
	
	@Override
	public void consultarChavesPix() {}
}

