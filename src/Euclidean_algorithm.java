public class Euclidean_algorithm {

	public static void main(String[] args) {
		char x ='a', y ='b';
		System.out.printf("Before exchang: %c, %c\n",x ,y );
		System.out.printf("After exchang: %c, %c",swap(x, y) ,swap(y, x) );
		

	}
	
	public static char swap(char x, char y) {
		char temp;
		temp = x;
		x = y;
		y = temp;
		
		return x;
	}

}
