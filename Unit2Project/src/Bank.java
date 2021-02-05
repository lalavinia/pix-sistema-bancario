/*	
 * Classname Bank
 * 
 * Version 2.0
 * 
 * Data: 10/01/2021 18:51
 * 
 * Autor: Menilson Rodrigues Matos
 * 
 * Classe responsável pela manutenção dos dados dos bancos
 * 
 */
public class Bank {
	// atributos
	private String name;
	private int idBank;
	private Agency[] agency;
	int code = 0;
	
	// construtores
	public Bank(String n, int id, int nAgency) {
		this.setCode();
		this.name = n;
		this.agency = new Agency[nAgency];
	}
	
	// métodos
	public int getCode() {
		return idBank;
	}
	
	public void setCode() {
		code++;
		this.idBank = code;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean addAgency(Agency newAgency, int nClients) {
		int agencyLength = this.agency.length;
		
		// verifica se o banco tem capacidade p +1 agencia e adiciona
		for(int i =0; i < agencyLength; i++) {
			if(this.agency[i] == null) {
				this.agency[i] = newAgency;
				return true;
			}
		} 
		return false;
	}
	
}