package banks;
import accounts.Conta;
import accounts.ContaCorrente;
import accounts.ContaPoupanca;
import accounts.ContaSalario;
import clients.Titular;

public class Agencia {
	private String  codigo;
	private Conta contas[]; 
	private Banco banco;
	private double montante;
	private int ultimo =0;
	
	public Agencia (Banco banco, String codigo) {
		this.banco = banco;
		this.codigo = codigo;
	}
	
	public Conta[] getContas() {
		return contas;
	}
	
	public Conta getConta(int codigo) {
		int posicao=0;
		for (int i = 0; i<ultimo; i++)
			if (contas[i].getCodigo() == codigo) {
				posicao = i;
			}
		return contas[posicao];
	}
	public Banco getBanco() {
		return banco;
	}
	
	public void cadastrarConta(int codigo, char tipo, Titular titular) {
			if(tipo == 'p') {
				//contas[ultimo] = new ContaPoupanca(this, codigo, titular);			
				if (ultimo == 0) {
					contas = new ContaPoupanca[ultimo+1];
					contas[0] = new ContaPoupanca(this, codigo, titular);
				}
				else {
					Conta[] aux = new Conta[ultimo+1];
					for(int j = 0; j < contas.length; j++) {
						aux[j] = new ContaPoupanca(this, codigo, titular);
						aux[j] = contas[j];
					}
					aux[ultimo] = new ContaPoupanca(this, codigo, titular);
					contas = new ContaPoupanca[ultimo+1];
					contas = aux;
				}
				ultimo++;			
			}
			
			if(tipo == 's') {
				contas[ultimo] = new ContaSalario(this, codigo, titular);			
			}
	}
	
	public void cadastrarConta(int codigo, char tipo, Titular titular, double saldo) {
		if(tipo == 'p') {
			if (ultimo == 0) {
				contas = new ContaPoupanca[ultimo+1];
				contas[0] = new ContaPoupanca(this, codigo, titular,saldo);
			}
			else {
				Conta[] aux = new Conta[ultimo+1];
				for(int j = 0; j < contas.length; j++) {
					aux[j] = new ContaPoupanca(this, codigo, titular,saldo);
					aux[j] = contas[j];
				}
				aux[ultimo] = new ContaPoupanca(this, codigo, titular,saldo);
				contas = new ContaPoupanca[ultimo+1];
				contas = aux;
			}
			ultimo++;
		}
		if(tipo == 'c') {
			contas[ultimo] = new ContaCorrente(this, codigo, titular, saldo);
		}
		if(tipo == 's') {
			contas[ultimo] = new ContaSalario(this, codigo, titular,saldo);		
		}
}
	
	
	public double calcularMontante() {
		int i; 
		for (i=0;i<contas.length;i++) {
			if (contas[i] !=null) {
				montante = montante + contas[i].getSaldo();
				}
		}
		return montante;
	}

	public String getCodigo() {
		return codigo;
	}
	
}
