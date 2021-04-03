package recitation1005;

import java.util.Scanner;

public class ValidEmail {
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Enter an email address: ");
			
			
			String email = scan.next();
		
			boolean isValid = true;
			
			int atIndex = email.indexOf('@');
			int dotIndex = email.indexOf('.');
			int length = email.length();
			
			if(atIndex == -1 || dotIndex == -1) {
					isValid = false;
			}
			else if (email.charAt(0) == '@') {
				isValid = false;
			}
			else if (atIndex == dotIndex + 1 || dotIndex == atIndex + 1) {
				isValid = false;
			}
			else if (dotIndex < atIndex) {
				isValid = false;
			}
			else if (email.charAt(email.length() -1)== '.') {
				isValid = false;
			}
			if (isValid) {
					 String userName = email.substring(0, atIndex);
					 String domainName = email.substring(atIndex +1 , email.length());
					 System.out.println("User name is " + userName);
					 
					 System.out.println("Domain name is " + domainName);
		
			}else {
					System.out.print("Invalid Address");
			}
			
			
			
			
		}

}
