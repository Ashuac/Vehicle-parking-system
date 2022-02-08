package Vehicle;

public class Token {
   int token;
   int Amount;

	Token(int token){
		this.token = token;
		
	}
	Token(int Amount,int token){
		this.Amount = Amount;
		this.token = token;
	}
	public int getToken(){
		return token;
		
	}
	public int getAmount() {
		return Amount;
	}

	
	

}
