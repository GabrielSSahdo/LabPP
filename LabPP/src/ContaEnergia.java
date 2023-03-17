import java.util.Scanner;

public class ContaEnergia {
	public static void main(String[] args) {
		double p;
		
		Scanner teclado = new Scanner(System.in);
		double contagem = teclado.nextDouble();
		char tipo = teclado.next().charAt(0);
		
		if(contagem < 0) {
			System.out.print("-1.00");
		}
		else {
			

		
			switch(tipo) {
				case 'R':
					if(contagem <= 500){
						p = contagem * 0.4;
						System.out.printf("%.2f\n", p);
					}
					else {
						p = contagem * 0.65;
						System.out.printf("%.2f\n", p);
					}
					break;
				case 'C':
					if(contagem <= 1000) {
						p = contagem * 0.55;
						System.out.printf("%.2f\n", p);
					}
					else {
						p = contagem * 0.6;
						System.out.printf("%.2f\n", p);
					}
					break;
				case 'I':
					if(contagem <= 5000) {
						p = contagem * 0.55;
						System.out.printf("%.2f\n", p);
					}
					else {
						p = contagem * 0.6;
						System.out.printf("%.2f\n", p);
					}
					break;
				default:
					System.out.print("-1.00");
				}
		}
	}

}

