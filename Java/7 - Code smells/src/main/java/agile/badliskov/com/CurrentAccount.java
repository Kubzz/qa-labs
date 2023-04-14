package agile.badliskov.com;

import java.util.ArrayList;
import java.util.Date;

public class CurrentAccount {
    	// We would have getters/setters for these but left out to minimise the code
	private String firstname, lastname, address;
	private int accountNumber;
	private double overdraftLimit;
	private double balance;
	private String accountType;
	private ArrayList<Payee> directDebits = new ArrayList<Payee>();
	private ArrayList<Payee> standingOrders = new ArrayList<Payee>();
	
	CurrentAccount(String firstname, String lastname, String address, int accountNumber, double overdraftLimit, double balance, String accoutType, ArrayList<Payee> directDebits, ArrayList<Payee>standingOrders) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.accountNumber = accountNumber;
        this.accountType = accoutType;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
        this.directDebits = directDebits;
        this.standingOrders = standingOrders;
    }

	public void withDraw(double amount) {
		if(amount > balance && accountType.equals("deposit"))
			return;
		balance -= amount;
	}
	public void deposit(double amount) {
		balance += amount;
	}	
	
	// used where account is current account
	public boolean isOverDrawn() {
		return false;
	}
	// used where account is current account
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	// used where account is current account
	public void processDirectDebits() {
		for(Payee payee : directDebits) {
		}
	}
	// used where account is current account
	public void processStandingOrders() {
		for(Payee payee : standingOrders) {
		}
	}
}
class Payee {
	private String name, address;
	private Date date;
	private double amount;
}
