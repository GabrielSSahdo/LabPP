import java.util.*;
public class ParImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int i = 0;
		
		while(i != -1) {
			i = teclado.nextInt();

			if(i%2==1) {
				System.out.println("IMPAR");
			}
			if(i%2==0) {
				System.out.println("PAR");
			}
		}
		

	}

}
