import java.util.Date;

public class SavingsAccount extends Account{
	// atributos
	private double balance;
	private Date dtBirthday;
	
	// construtores
	public SavingsAccount(int cod, double b) {
		super(cod, b);
	}
	// métodos
	
	public boolean deposit(double value) {
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
