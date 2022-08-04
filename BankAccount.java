
public class BankAccount
{

	
//states: account number,account name; balance
//Member attributes
//the attributes are private so they cannot be accessed outside the class
//They are also known as instance variables because each instance or object of this class
// will have its own copy of these variables
	private int accountNumber;
	private String accountName;
	private double balance;
	private double Transaction1, Transaction2, Transaction3;
	
	
	
//Constructor (method)
	public BankAccount (int accountNumber, String accountName, double balance) 
	{	this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;	
		this.Transaction1 = 0.0;
		this.Transaction2 = 0.0;
		this.Transaction3 = 0.0;
	}
	public BankAccount(int accountNumber, String accountName) 
	{	this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = 0.0;	
		this.Transaction1 = 0.0;
		this.Transaction2 = 0.0;
		this.Transaction3 = 0.0;
	}//default value 
	
	
	public BankAccount()
	{	//default Constructor
		this.accountNumber = 00000000;
		this.accountName = "Uknown";
		this.balance = 0.0;		
		this.Transaction1 = 0.0;
		this.Transaction2 = 0.0;
		this.Transaction3 = 0.0;
}
		
// behaviours: deposit, displayBalance, transfer
	public void displayBalance() 
	{	System.out.println("Balance of "+accountName+" "+accountNumber+" is:  "+balance);
		System.out.println("Last Transactions: ");
	 	if (Transaction1 >0) {System.out.println("Deposit: " +Transaction1);} else {System.out.println("Withdraw: "+Transaction1);}
	 	if (Transaction2 >0) {System.out.println("Deposit: " +Transaction2);} else {System.out.println("Withdraw: "+Transaction2);}
	 	if (Transaction1 >0) {System.out.println("Deposit: " +Transaction3);} else {System.out.println("Withdraw: "+Transaction3);}
	}

/*if (Transaction1>=0) {
		System.out.println("You Deposited: "+Transaction1);
} else {
		System.out.println("You Withdrawed: "+Transaction1);}}*/		
	
//deposit
	public void deposit (double amount) 
	{	if (amount >= 0){
		balance += amount; 
		Transaction3 = Transaction2;
		Transaction2 = Transaction1;
		Transaction1 = amount;}
	else {System.out.println("Deposit Invalid");}
	}
	

//withdraw
	public void withdraw(double amount) 
	{	if (balance >0){
		balance-=amount; 
		Transaction3 = Transaction2;
		Transaction2 = Transaction1;
		Transaction1 = amount*-1;}
		else{System.out.println("ammount unavailable");	}		
	}

//this is a comments to eddit the github thing



}



