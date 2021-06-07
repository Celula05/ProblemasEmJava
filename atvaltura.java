package atvdanielo;
import java.util.Locale;
import java.util.Scanner;
public class atvaltura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int contador;
		double idade, media, excluir, altura;
		contador = 1;
		media = 0;
		excluir =1;
		
		do {
			
			System.out.print("Digite a idade do " + contador + "º: ");
			idade = sc.nextDouble();
			
			System.out.print("Digite a altura do " + contador + "º: ");
			altura = sc.nextDouble();
			
			if (idade > 50) 
			{
			media += altura;	
			}
			else 
			{	
			excluir++;
			}
			
			
		contador++;
		
		} while (idade != 0);
		
		media = media / (contador - excluir);
	
		System.out.print("A media da altura das pessoas é de: " + media);
		sc.close();
	}

}
