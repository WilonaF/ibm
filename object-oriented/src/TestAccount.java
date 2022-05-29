import com.ibm.bank.AccountFactory;
import com.ibm.bank.Accounts;
import com.ibm.bank.BalanceException;
import com.ibm.bank.Bank;
import com.ibm.bank.Current;

public class TestAccount {

	public static void main(String[] args) {
		
		/*Accounts a1 = new Accounts(1234, "Wilona", 200);
		a1.deposit(300);
		a1.summary();
		a1.withdraw(100);
		a1.summary();
		
		Current c1 = new Current("Ben");
		c1.summary();
		
		c1.withdraw(3000);
		c1.withdraw(5000);
		c1.summary();
		
		c1.deposit(2000);
		c1.deposit(4000);
		c1.summary();*/
		
		AccountFactory factory = new AccountFactory();
		
		Bank s = factory.openSavingsAccount("Polo");
		
		try {
			s.withdraw(100);
		}catch(BalanceException e) {
			System.out.println(e.getMessage());
		}
	
	}
}
