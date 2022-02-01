

import java.util.Scanner;

class Leap { 

	public static void main (String [] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println ("Please enter a year: ");
		int yr = in.nextInt();
		
		if (yr%400==0) { System.out.println ("It is a Leap Year!");}
			
		else if ((yr%4==0) && (yr%100!=0)) {
			System.out.println ("It is a Leap Year!");}
			
		else { System.out.println ("It is NOT a Leap Year!");}
		 
	}
}	
		 
		 
		 
				