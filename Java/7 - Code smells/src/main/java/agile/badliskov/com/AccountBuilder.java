package agile.badliskov.com;

import java.util.ArrayList;

public class AccountBuilder {
    private String firstname, lastname, address;
	private int accountNumber;
	private double interest;
	private double overdraftLimit;
	private double balance;
	private String accountType;
	private ArrayList<Payee> directDebits = new ArrayList<Payee>();
	private ArrayList<Payee> standingOrders = new ArrayList<Payee>();

    public CurrentAccount buildCurrent() {
        CurrentAccount curr = new CurrentAccount(this.firstname, this.lastname, this.address, this.accountNumber, this.overdraftLimit, this.balance, this.accountType, this.directDebits, this.standingOrders);

        return curr;
    }

    public DepositAccount buildDeposit() {
        DepositAccount dep = new DepositAccount(this.firstname, this.lastname, this.address, this.accountNumber, this.balance, this.accountType);

        return dep;
    }
}
