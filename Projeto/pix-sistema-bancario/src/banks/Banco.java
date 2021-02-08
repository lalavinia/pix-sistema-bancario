package banks;

public class Banco {
	private int codigo;
	private String nome;
	private double montante;
	private Agencia agencias[];
	private int ultimo =0;
	
	public Banco(int codigo, String nome){
		this.codigo = codigo;
		this.nome = nome;
		this.montante = 0;
	}
	
	public Agencia[] getAgencia() {
		return agencias;
	}
	
	public Agencia getAgencia(String codigo) {
		int posicao=0;
		for (int i = 0; i<ultimo; i++)
			if (agencias[i].getCodigo().equals(codigo)) {
				posicao = i;
			}
		return agencias[posicao];
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void cadastrarAgencia(String codigo) {
		if (ultimo == 0) {
			agencias = new Agencia[ultimo+1];
			agencias[0] = new Agencia(this,codigo);
		}
		else {
			Agencia[] aux = new Agencia[ultimo+1];
			for(int j = 0; j < agencias.length; j++) {
				aux[j] = new Agencia(this,codigo);
				aux[j] = agencias[j];
			}
			aux[ultimo] = new Agencia(this,codigo);
			agencias = new Agencia[ultimo+1];
			agencias = aux;
		}
		ultimo++;
	}
	
	public double calcularMontante() {
		int i; 
		for (i=0;i<agencias.length;i++) {
			if (agencias[i] !=null) {
				montante = montante + agencias[i].calcularMontante();
				}
		}
		return montante;
	}
	
}
