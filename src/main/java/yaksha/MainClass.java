package yaksha;

import java.util.Scanner;

public class MainClass {

	
	public static void main(String[] args) {
		
		 User[] uarr= new User[10];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < uarr.length; i++) {
			
		
		System.out.println("Enter user details :q to quit");
		String istr=sc.nextLine();
		if (istr.equalsIgnoreCase("q") )break;
				
		String[] iarr = istr.split(",");
		
		User usr1 =  new User(iarr[0], iarr[1]);
		
		System.out.println("User added .Count = "+ User.getCount());
		
		}
		
	}


	

}
