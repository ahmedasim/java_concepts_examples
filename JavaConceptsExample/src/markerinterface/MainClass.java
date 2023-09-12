package markerinterface;

public class MainClass {

	public static void main(String[] args) {
		TransactionEntity sameBankTransaction = new SameBankFtTransactionEntity();
		TransactionEntity crossBankTransaction = new CrossBankFtTransactionEntity();
		TransactionService ts = new TransactionService();
		try {
			ts.update(sameBankTransaction);
			ts.update(crossBankTransaction);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	      
	}

}
