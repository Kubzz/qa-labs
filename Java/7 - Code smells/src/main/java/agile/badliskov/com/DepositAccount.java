package agile.badliskov.com;

public class DepositAccount {
    	// We would have getters/setters for these but left out to minimise the code
	private String firstname, lastname, address;
	private int accountNumber;
	private double interest;
	private double balance;
	private String accountType;
	
	DepositAccount(String firstname, String lastname, String address, int accountNumber, double balance, String accoutType) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.accountNumber = accountNumber;
        this.accountType = accoutType;
    }

	public void withDraw(double amount) {
		if(amount > balance && accountType.equals("deposit"))
			return;
		balance -= amount;
	}
	public void deposit(double amount) {
		balance += amount;
	}	
	
	public void addInterestToAccount() { // used where account is a deposit acct
		balance += balance * 0.0001;
	}
}
