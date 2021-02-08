package banks;

public class BancoCentral {
	private Banco[] bancos;
	private int ultimo = 0;
	
		
	public Banco getBancos(int codigo) {
		int posicao=0;
		for (int i = 0; i<ultimo; i++)
			if (bancos[i].getCodigo() == codigo) {
				posicao = i;
			}
		return bancos[posicao];
	}
	
	public void cadastrar(int cod, String nome) {
		if (ultimo == 0) {
			bancos = new Banco[ultimo+1];
			bancos[0] = new Banco(cod, nome);
		}
		else {
			Banco[] aux = new Banco[ultimo+1];
			for(int j = 0; j < bancos.length; j++) {
				aux[j] = new Banco(cod, nome);
				aux[j] = bancos[j];
			}
			aux[ultimo] = new Banco(cod, nome);
			bancos = new Banco[ultimo+1];
			bancos = aux;
		}
		ultimo++;
	}
	
	//bancos[0] = new Banco(0,"BB",3);
	//bancos[1] = new Banco(1,"AA",2);
	
	public void transferencia(int bancoRementente, int codRemetente, String agRemetente, int bancoDestinatario, int codDestinatario, String agDestinatario, double valor) {
		getBancos(bancoRementente).getAgencia(agRemetente).getConta(codRemetente).sacar(valor);
		getBancos(bancoDestinatario).getAgencia(agDestinatario).getConta(codDestinatario).depositar(valor);
		
	}
}
