import java.util.Scanner;
public class Desconto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double num = entrada.nextFloat();
		
		double desconto =5.0/100.0 * num;
		if(num>=200) {
			num = num - desconto;
		}
		System.out.printf("%.2f\n", num);
	}
}