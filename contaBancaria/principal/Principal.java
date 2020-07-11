package principal;

import java.util.Scanner;

public class Principal{
	
	public static void main(String[] args){
		Scanner inputMenu = new Scanner(System.in);
		Scanner inputNome = new Scanner(System.in);
		
		//menuzinho genérico
		while(true){
			System.out.println("1 - Criar uma conta.");
			System.out.println("2 - Entrar em uma conta.");
			System.out.println("0 - Sair!");
			int opcao = inputMenu.nextInt();
			int numConta;
			String nome;
			switch(opcao){
				case 1:
					System.out.print("Digite seu nome completo: ");
					nome = inputNome.nextLine();
					
					System.out.print("Digite o tipo de conta, 1 para comum, 2 para especial: ");
					opcao = inputMenu.nextInt();
					
					if(opcao == 1) {
						//construtor conta comum, retornar num da conta
					} else if (opcao == 2) {
						//construtor conta epsecial, retornar num da conta
					} else {
						System.out.println("");
						System.out.println("Opção inválida! Tente novamente.");
						System.out.println("");
						
						break;
					}
					
					break;
				case 2:
					break;
				case 0:
					return;
			}
		}
	}
	
}