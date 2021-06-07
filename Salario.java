package atv;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.print("|----------------------------|\n");
         System.out.print("|       Menu de opções       |\n");
         System.out.print("|----------------------------|\n");
         System.out.print("| 1 - Novo Salário           |\n");
         System.out.print("| 2 - Férias                 |\n");
         System.out.print("| 3 - Décimo Terceiro        |\n");
         System.out.print("| 4 - Sair                   |\n");
         System.out.print("|----------------------------|\n");
         System.out.print("Digite uma opção: ");
         
         int opcao;
         int salario;
         int meses;
         boolean continuar = true;
         
         while(continuar == true){
           opcao = sc.nextInt();
           switch (opcao){
           
             case 1:
             
             System.out.print("\nOpcão Novo Salário selecionada\n");
             System.out.println("Imforme seu Salário: ");
             salario = sc.nextInt();
             if (salario <= 210){
               System.out.println("O aumento no seu salário será de: R$" + salario * 0.15);
             }else if(salario > 210 && salario <= 600){
               System.out.println("O aumento no seu salário será de: R$" + salario * 0.10);
             }else System.out.println("O aumento no seu salário será de: R$" + salario * 0.05);
             break;
             
             case 2:
             
             System.out.print("\nOpcão Férias selecionada\n");
             System.out.println("Imforme seu Salário: ");
             salario = sc.nextInt();
             if (salario > 0){
               System.out.println("O aumento na remuneração de férias será de: R$" + salario * 1/3);
}
             break;
             
             case 3:
             
             System.out.print("\nOpcão Décimo Terceiro selecionada\n");
             System.out.println("Imforme seu Salário: ");
             salario = sc.nextInt();
             System.out.println("Imforme o número de meses trabalhados: ");
             meses = sc.nextInt();
             if (meses > 12){
               System.out.print("ERRO");            
             }else System.out.println("Seu Décimo Terceiro será de: R$" + (salario * meses /12));
             break;
             
             default:
             
             System.out.print("\nOpção Inválida!");
             break;
             
             case 4:
             
             System.out.print("\nTchau!");
             continuar = false;
             sc.close();
}          
}   
}
}