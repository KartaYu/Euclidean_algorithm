public class Euclidean_algorithm {

	public static void main(String[] args) {
		char x ='a', y ='b';
		System.out.print(swap(x,y));

	}
	
	public static char swap(char x, char y) {
		char temp;
		temp = x;
		x = y;
		y = temp;
		
		return x;
	}

}
