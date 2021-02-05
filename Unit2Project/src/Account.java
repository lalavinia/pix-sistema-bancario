
abstract class Account {
	// atributos
	private int idAccount;
	private double balance;
	private Client client;
	private Pix pix;
	
	// construtores
	public Account(int id, double b) {
		this.idAccount = id;
		this.balance = b;
	}
	
	// métodos
	public int getCod() {
		return idAccount;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double b) {
		this.balance = b;
	}
	
	public void extrato() {
		
	}
	
	public void transfer(Account c, int value) {
		if(getBalance() - value >= 0) {
			this.receber(-value);
			c.receber(value);
		}
	}
	
	private void receber(double value) {
		this.balance = getBalance() + value;
	}
	
}
