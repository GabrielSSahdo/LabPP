import java.util.ArrayList;
import java.util.Scanner;


public class PorcentagemAcerto {

	public static void main(String[] args) {
		
		ArrayList<Float> respostas = new ArrayList<> ();
		ArrayList<Float> gabarito = new ArrayList<> ();
		int acertos = 0;
				
		Scanner teclado = new Scanner(System.in);
		
		float resposta = teclado.nextFloat();
		
		while(resposta != -1) {
			respostas.add(resposta);
			resposta = teclado.nextFloat();
		}
		
		resposta = teclado.nextFloat();
		while(resposta != -1){
		  	gabarito.add(resposta);
		  	resposta = teclado.nextFloat();
		}
		
		for(int i = 0; i < gabarito.size(); i++) {
			float res = respostas.get(i);
			float gab = gabarito.get(i); 
			if (res == gab) {
				acertos++;
			}
		}
		
		
		float acertoPorcentagem = acertos*100/respostas.size();
		System.out.printf("%.2f", acertoPorcentagem);
		teclado.close();
	}
}
