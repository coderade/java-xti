
public class AccountTest {

	public static void main(String[] args) 
	{
	Account account = new Account();
	account.name = "Valdeci Gomes";
	account.balance = 100000.00;

	Account destiny = new Account();
	destiny.name = "Bill Gates";
	destiny.balance = 10000;
	
	account.ShowBalance();
	destiny.ShowBalance();
	
	account.Transfer(destiny, 60000);
	
	account.ShowBalance();
	destiny.ShowBalance();
	
	
	}
	

}
