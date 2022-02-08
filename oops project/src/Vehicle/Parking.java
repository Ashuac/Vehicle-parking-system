package Vehicle;

import java.util.HashMap;

	public class Parking {
		double parkSize = 2000;
		HashMap<Integer,Roadvehicles> hash = new HashMap<>();
		int LastTokenid = 0;
		 
		public Token comesIn(Roadvehicles r) throws InSufficientSpaceException{
			if(r.space()<parkSize) {
				LastTokenid++;
				hash.put(LastTokenid,r);
				 parkSize=parkSize-r.space();
				 Token token = new Token(LastTokenid);
		           
		            return token;
			}
			else {throw new InSufficientSpaceException();
			}
			}
		public Roadvehicles goesOut(Token token)throws InSufficientAmount{
			int id = token.getToken();
			Roadvehicles r = hash.get(id);
			int amt = 0;
			if(r instanceof TwoWheel) {
				amt  = 20;
			}
			else if (r instanceof amphibian) {
				amt = 60;
			}
		
		else if (r instanceof fourWheel) {
			amt = 40;
		}
			System.out.println(token.getAmount());
			System.out.println(amt);
	 if(token.getAmount() == amt) {
		 return r;
		 
	 }
	 else throw new InSufficientAmount();
		
		}		
			
	}
	
