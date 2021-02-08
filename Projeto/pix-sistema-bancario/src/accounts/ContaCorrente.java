package accounts;
import banks.Agencia;
import clients.Titular;
import pix.Pix;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(Agencia agencia, int codigo, Titular titular, double saldo) {
		super(agencia, codigo, titular, saldo);
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
		if (valor <= saldo) {
			
		}
		//banco central libera
		return true;
	}
	
	@Override
	public void exibirExtrato(int mes) {
		//arquivos
	}
	
	@Override
	public void exibirSaldo() {
		System.out.println("O saldo atual eh: " + saldo);
	}
	
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
