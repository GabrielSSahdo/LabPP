import java.util.Scanner;


public class Xadrez {
	
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		int k = teclado.nextInt();
		
		for( int i = 0; i < k ; i++){
			if( i % 2 == 0 ) {
				for (int j = 0; j < k ; j++) {
					System.out.print("* ");
				}
				System.out.println();
			} else {
				for (int j = 0; j < k ; j++) {
					System.out.print(" *");
				}
				System.out.println();
			}
		}
	}
}