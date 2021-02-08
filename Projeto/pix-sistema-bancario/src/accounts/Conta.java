package accounts;
import pix.Pix;
import clients.Titular;
import banks.Agencia;

abstract public class Conta {
	protected int codigo;
	protected double saldo = 0;
	protected Titular titular;
	protected double limite;
	protected Agencia agencia;
	
	public Conta(Agencia agencia, int codigo, Titular titular, double saldo) {
		this.agencia = agencia;
		this.codigo = codigo;
		this.saldo = saldo;
		this.titular = titular;
	}
	
	public Conta(Agencia agencia, int codigo, Titular titular) {
		this.agencia = agencia;
		this.codigo = codigo;
		this.titular = titular;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Titular getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	
	public abstract boolean sacar(double valor);
	public abstract boolean depositar(double valor);
	public abstract boolean transferir(double valor, int codigo);
	public abstract void exibirExtrato(int mes);
	public abstract void exibirSaldo();
	public abstract boolean cadastrarPix(Pix novoPix);
	public abstract boolean pagarComPix(double valor);
	public abstract void consultarChavesPix();
			
}
