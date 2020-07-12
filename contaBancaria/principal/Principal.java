package principal;

import java.util.*;
import contas.*;

public class Principal{
	
	public static void main(String[] args){
		Scanner inputMenu = new Scanner(System.in);
		Scanner inputNome = new Scanner(System.in);
		Scanner inputSaldo = new Scanner(System.in);
		
		//menuzinho genérico
		while(true){
			System.out.println("1 - Criar uma conta.");
			System.out.println("2 - Entrar em uma conta.");
			System.out.println("0 - Sair!");
			int opcao = inputMenu.nextInt();
			int numConta;
			String nome;
			float saldo;
			List<ContaComum> contasComuns = new ArrayList<ContaComum>();
			List<ContaEspecial> contasEspeciais = new ArrayList<ContaEspecial>();
			
			switch(opcao){
				case 1:
					System.out.print("Digite seu nome completo: ");
					nome = inputNome.nextLine();
					
					System.out.print("Digite o tipo de conta, 1 para comum, 2 para especial: ");
					opcao = inputMenu.nextInt();
					
					System.out.print("Digite o numero da conta: ");
					numConta = inputMenu.nextInt();
					
					if(opcao == 1) {
						//construtor conta comum, retornar num da conta
						Conta contaComum = new Conta(numConta, nome);
					} else if (opcao == 2) {
						//construtor conta especial, retornar num da conta
					} else {
						System.out.println("");
						System.out.println("Opção inválida! Tente novamente.");
						System.out.println("");
						
						break;
					}
					
					break;
				case 2:
					System.out.print("Digite o número da conta: ");
					opcao = inputMenu.nextInt();
					//procurar nas instancias de contas por esse número... vish
					break;
				case 0:
					return;
			}
		}
	}
	
}