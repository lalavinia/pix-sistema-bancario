/*	
 * Classname Client
 * 
 * Version 1.2
 * 
 * Data: 29/01/2021 18:51
 * 
 * Autor: Menilson Rodrigues Matos
 * 
 * Classe responsável pela manutenção dos dados dos clientes
 * 
 */
public class Client {
	// atributos
	private String name;
	private Account []account;
	
	// construtores
	
	public Client(String n) {
		this.setName(n);
	}
	// métodos
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addAccount(Account newAccount, int type) {
		if(type == 0) {
			int contasLength = this.account.length;

			//VERIFICAR SE HA ESPACO VAZIO NO ARRAY CONTA
			for(int i = 0; i < contasLength; i++) {
				if(this.account[i] == null) {
					this.account[i] = newAccount;
				}
			}
			//AUMENTAR O TAMANHO DO ARRAY E ADICIONA O NOVO CLIENTE
			Account [] newArrayAccount = new Account[ contasLength * 10 ];
			for(int i = 0; i < contasLength; i++) {
				newArrayAccount[i] = this.account[i];
			}
			newArrayAccount[ contasLength ] = newAccount;
			this.account = newArrayAccount;
		}
	}
	
}
