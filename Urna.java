package programas;

import java.util.Scanner;
import java.util.Locale;

public class Urna {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		int usuario, Contador1, Contador2, Contador3, Contador4, ContadorN, ContadorB;
		double PorcentagemN, PorcentagemB, VotosTotais;
		String pn, pb;
		
		
		
		Contador1 = 0;
		Contador2 = 0;
		Contador3 = 0;
		Contador4 = 0;
		ContadorN = 0;
		ContadorB = 0;
		
		

		do {
			
			System.out.println("1, 2, 3, 4  ----  Votos para os respectivos candidatos");
			System.out.println("5           ----  Voto nulo");
			System.out.println("6           ----  Voto em branco");
			
			usuario = sc.nextInt();
			
			
			switch (usuario) {
			
			case 0: System.out.println("Você encerrou o programa!");
			System.out.println();
			break;
			case 1: Contador1++;
			break;
			case 2: Contador2++;
			break;
			case 3: Contador3++;
			break;
			case 4: Contador4++;
			break;
			case 5: ContadorN++;
			break;
			case 6: ContadorB++;
			break;
			default: System.out.println("Você digitou um número inválido");
			System.out.println();
			break;
								
			}
			
	
		} while (usuario != 0);
	
		
		
		VotosTotais = Contador1 + Contador2 + Contador3 + Contador4 + ContadorN + ContadorB; 
			
		PorcentagemN = (ContadorN * 100) / VotosTotais;
		PorcentagemB = (ContadorB * 100) / VotosTotais;
		
		pn = String.format("%.2f", PorcentagemN);
		pb = String.format("%.2f", PorcentagemB);
	
		
		System.out.println("Os votos para o candidato 1 foi: " + Contador1 + " votos");
		System.out.println("Os votos para o candidato 2 foi: " + Contador2 + " votos");
		System.out.println("Os votos para o candidato 3 foi: " + Contador3 + " votos");
		System.out.println("Os votos para o candidato 4 foi: " + Contador4 + " votos");
		System.out.println("O total de votos nulo foi de: " + ContadorN + " votos");
		System.out.println("O total de votos em branco foi de: " + ContadorB + " votos");
		System.out.println("A porcentagem de votos nulos sobre o total de votos foi de: " + pn + "%");
		System.out.println("A porcentagem de votos em branco sobre o total de votos foi de: " + pb + "%");
		
		
		
		
   
		sc.close();

	}

}