import java.util.Scanner;

public class Euclidean_algorithm {
	
	public static int Euclidean_algorithm(int dividend, int divisor) {
		if(dividend % divisor == 0) {
			return divisor;
		}
		return Euclidean_algorithm(divisor, dividend%divisor);
	}

	public static void main(String[] args) {
		int dividend, divisor;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entry dividend and divisor : ");
		
		dividend = input.nextInt(); 
		divisor = input.nextInt();
		
		System.out.print(Euclidean_algorithm(dividend, divisor));

	}

}
