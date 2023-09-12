package markerinterface;

public class TransactionService{
	public TransactionService(){
		  
	  }
	public void update(TransactionEntity transaction) throws Exception{
		validateBeforeUpdate(transaction);
		//update();
		System.out.println("Transaction updated");
	}

	private void validateBeforeUpdate(TransactionEntity transaction) throws Exception{
		if(transaction instanceof FundTransferTransactionNotUpdateable){
			throw new Exception("Fund Transfer Transaction Not Updateable");
		}
	}
}
