package recitation1005;

import java.util.Scanner;;

public class TaxReturn {
		public static void main(String[] args) {
			
			final double Rate1 = 0.15;
			final double Rate2 = 0.28;
			final double Rate3 = 0.31;
			
			final double SingleBracket1 = 21450;
			final double SingleBracket2 = 51900;
			final double MarriedBracket1 = 35800;
			final double MarriedBracket2 = 86500;
			
			double tax1 = 0.0;
			double tax2 = 0.0;
			double tax3 = 0.0;
			
			int dependents = 0;
			double singleIncome = 0.0;
			double spouseIncome = 0.0;
			
			//First user input
			Scanner in = new Scanner (System.in);
			
			System.out.print("Enter Filing status. Type single or married: ");
		
			String maritalStatus = in.next();
			
			if (maritalStatus.equals("single") || maritalStatus.equals("married")) {
				System.out.print("Enter number of dependents: ");
			}else {
				System.out.print("Invalid Input");
				return;
			}
				if (in.hasNextInt()) {
					dependents = in.nextInt();
				} else {
					System.out.print("Invalid Input");
					return;
				}
				
				if(dependents < 0 ) {
					System.out.print("Invalid Input");
					return;
				}

				if (maritalStatus.equals("single")) {
					dependents++;
				}if (maritalStatus.equals("married")) {
					dependents = dependents + 2;
				}
				
			
			if (maritalStatus.equals("single")) {
					System.out.print("Enter your income: ");
					if (in.hasNextDouble()) {
						singleIncome = in.nextDouble();
					} else {
						System.out.print("Invalid Input");
						return;
					}
					
					if(singleIncome < 0 ) {
						System.out.print("Invalid Input");
						return;
					}
					 
			} else {
					System.out.print("Enter your income: ");
					if (in.hasNextDouble()) {
						singleIncome = in.nextDouble();
					} else {
						System.out.print("Invalid Input");
						return;
					}
					
					if(singleIncome < 0 ) {
						System.out.print("Invalid Input");
						return;
					}
					System.out.print("Enter spouse's income: ");
					if (in.hasNextDouble()) {
						spouseIncome = in.nextDouble();
					} else {
						System.out.print("Invalid Input");
						return;
					}
					
					if(spouseIncome < 0 ) {
						System.out.print("Invalid Input");
						return;
					}
			}
			 
					double totalIncome = singleIncome + spouseIncome;
					double marriedIncome = singleIncome + spouseIncome;
			//calculations
			
		if (maritalStatus.equals("single")) {
			if (dependents >= 0 && dependents <= 4) {
					 double dependentsDiscount = dependents * 5000;
						singleIncome = singleIncome - dependentsDiscount;
			}
			else if (dependents >= 5) {
					double dependentsDiscount = dependents * 4500;
						singleIncome = singleIncome - dependentsDiscount;
			}		
		}else if (dependents >= 0 && dependents <= 4){
			double dependentsDiscount = dependents * 5000;
			marriedIncome = marriedIncome - dependentsDiscount;
		} else if (dependents >= 5) {
			double dependentsDiscount = dependents * 4500;
			marriedIncome = marriedIncome - dependentsDiscount;
		}
			
			
			 if (maritalStatus.equals("single"))
		        {
		            if (singleIncome <= SingleBracket1)
		            {
		                tax1 = Rate1 * singleIncome;
		            }
		            else if (singleIncome <= SingleBracket2)
		            {
		                tax1 = Rate1 * SingleBracket1;
		                tax2 = Rate2 * (singleIncome - SingleBracket1);
		            }
		            else // income > SINGLE_BRACKET2
		            {
		                tax1 = Rate1 * SingleBracket1;
		                tax2 = Rate2 *(SingleBracket2 - SingleBracket1);
		                tax3 = Rate3 *(singleIncome - SingleBracket2);
		            } // end if-else
		        }
		        else // assume marital status is married without explicitly checking
		        {
		            if (marriedIncome <= MarriedBracket1)
		            {
		                tax1 = Rate1 * marriedIncome;
		            }
		            else if (marriedIncome <= MarriedBracket2)
		            {
		                tax1 = Rate1 * MarriedBracket1;
		                tax2 = Rate2 * (marriedIncome - MarriedBracket1);
		            }
		            else // income > MARRIED_BRACKET2
		            {
		                tax1 = Rate1 * MarriedBracket1;
		                tax2 = Rate2 *(MarriedBracket2 - MarriedBracket1);
		                tax3 = Rate3 *(marriedIncome - MarriedBracket2);
		            } // end if-else

		        } // end if-else for single vs married

		        // The total tax is the sum of tax1 + tax2 + tax3

		        double totalTax = tax1 + tax2 + tax3;
			
			
		
					System.out.printf("%-18s", "Filing Status");
					System.out.printf("%-24s", "Annual Gross Income");
					System.out.printf("%-15s", "Dependents");
					System.out.printf("%-8s", "Tax Owed");
		
					System.out.println();
					
					System.out.printf( "%-18s", maritalStatus);
					System.out.printf("%-,24.2f", totalIncome);		
					
					if (maritalStatus.equals("single")) {
						System.out.printf("%-15d", dependents - 1);
					}else {
							System.out.printf("%-15d", dependents -2);
						}
					if (totalTax <= 0) {
					System.out.print("0.00");
	
					}else {
						System.out.printf("%-,12.2f" , totalTax);
					}
		
	}
}					

					


		
				
			
				
			


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

