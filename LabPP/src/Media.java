import java.util.Scanner;
public class Media {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		float num;
		float soma = 0;
		float media = 0;
		for(int i = 3;i!=0;i--) {
			num = teclado.nextFloat();
			soma = soma + num;
		}
		media = soma/3;
		System.out.printf("%.2f\n", media);
	}
}
