
public class CurrentAccount extends Account {
	// atributos
	private double balance;
	
	// construtores
	public CurrentAccount(int id, double b) {
		super(id, b);
	} 
	// métodos
	
	public boolean deposit(int value) {
		this.balance =+ value;
		return true;
	} 
	
	public boolean saque(double value) {
		if(this.balance >= value) {
			this.balance =- value;
			return true;
		} else
			return false;
	}
	
}
