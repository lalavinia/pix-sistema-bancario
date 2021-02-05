/*	
 * Classname Agency
 * 
 * Version 1.0
 * 
 * Data: 05/01/2021 18:51
 * 
 * Autor: Menilson Rodrigues Matos
 * 
 * Classe respons�vel pela manuten��o dos dados das ag�ncias
 * 
 */
public class Agency {
	// atributos
	private int idAgency;
	private Client[] clients;
	private Bank bank;
	private Account[] accounts;
	
	// construtores
	/*
	 * nClient � a capacidade de clientes da agencia setada
	 * nAccount � a capacidade de contas da agencia setada
	 *  
	 * */
	public Agency(int id, int nClient, Bank b, int nAccount) {
		this.idAgency = id;
		this.bank = b;
		this.accounts = new Account[nAccount];
		this.clients = new Client[nClient];
	}
	
	// m�todos 
	public int getIdAgency() {
		return this.idAgency;
	}
	
	public boolean addClient(Client newClient) {
		int clientLength = this.clients.length;
		
		// verifica se a agencia tem capacidade p +1 cliente
		for(int i =0; i < clientLength; i++) {
			if(this.clients[i] == null) {
				this.clients[i] = newClient;
				return true;
			}
		} 
		return false;
	}
	
}
