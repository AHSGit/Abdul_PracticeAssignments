import java.util.Scanner;

class Prac6 {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the radius of the cylinder (in cms): ");
		double R = sc.nextDouble();
		
		System.out.println("");
		System.out.println("Please enter the height of the cylinder (in cms): ");
		double H = sc.nextDouble();

		final double PI = 3.14159;
		double V = PI*R*R*H;
		
		System.out.println("");
		System.out.println("The volume of the cylinder is: " + V + " cm3.");
	}
}