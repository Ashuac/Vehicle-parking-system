package Vehicle;

import java.util.Scanner;

public class MAIN22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Parking p = new Parking();
		while(true) {
			System.out.println("press 1 to enter your car");
			System.out.println("press 2 to get your car out");
			
			int option = sc.nextInt();
			switch (option){
			case 1:
				System.out.println("Select vehicle type--");
				System.out.println("1.Two Wheeler");
				System.out.println("2.Four Wheeler");
				int vehicleType = sc.nextInt();
				try {
					if(vehicleType == 1) {
						System.out.println("SELECT YOUR VEHICLE");
						System.out.println("1 Activa");
						System.out.println("2 Bullet");
						int vehicle = sc.nextInt();
						
						if(vehicle == 1) {
							Roadvehicles t1 = new activa();
							Token token = p.comesIn(t1);
	    					System.out.println("YOUR TOKEN ID IS:"+token.getToken());
						}
						else if(vehicle == 2) {
							Roadvehicles t2 = new bullet();
	    					System.out.println("YOUR TOKEN ID IS:"+p.comesIn(t2).getToken());
						}
					}else if(vehicleType == 2) {
						System.out.println("SELECT YOUR VEHICLE");
						System.out.println("1 NANO");
						System.out.println("2 INOVA");
						System.out.println("3 AMPHIBIAN");
						int vehicle = sc.nextInt();
						
						if(vehicle == 1) {
							Roadvehicles t3 = new nano();
							System.out.println("YOU TOKEN ID IS"+p.comesIn(t3).getToken());
						}
						else if(vehicle == 2) {
							Roadvehicles t4 = new inova();
							System.out.println("YOU TOKEN ID IS"+p.comesIn(t4).getToken());
						}
						if(vehicle == 3) {
							Roadvehicles t5 = new amphibian();
							System.out.println("YOU TOKEN ID IS"+p.comesIn(t5).getToken());
						

						}

					}
						
					//catch(InSufficientAmount e) {
						//System.out.println("AREA IS FULL"+e);	

					}catch(InSufficientSpaceException e) {
						System.out.println("---");
					}break;
			case 2:
				try {
					System.out.println("ENTER YOUR TOKEN ID:");
					int LastTokenid = sc.nextInt();
					System.out.println("ENTER AMOUNT:");
					int amt = sc.nextInt();
					Token token = new Token(amt,LastTokenid);
					
					System.out.println(p.goesOut(token));
					break;

				}catch(InSufficientAmount e) {
					System.out.println("INVALID AMOUNT"+e);	
				//}catch(InSufficientSpaceException e) {
					//System.out.println("Sorry!NO VEHICLES CAN BE PARKED DUE TO LESS SPACE"+e);
				}
				}
				
				
		}
	}


}
