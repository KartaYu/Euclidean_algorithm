import java.util.Scanner;

public class Euclidean_algorithm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number1, number2;
		System.out.printf("Please enter two integer :");
		number1 = scan.nextInt();number2 = scan.nextInt();
		System.out.printf("GCD = ");
	    GCD(number1, number2);
		
	}
	
	public static void GCD(int x, int y) {
		if((x % y) == 0)
			System.out.print(y);
		else
			GCD (y, (x % y));
	}

}
