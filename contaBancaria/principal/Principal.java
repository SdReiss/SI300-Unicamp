package principal;

import java.util.*;
import contas.*;

public class Principal{
	
	public static void main(String[] args){
		Scanner inputMenu = new Scanner(System.in);
		Scanner inputNome = new Scanner(System.in);
		Scanner inputSaldo = new Scanner(System.in);
		
		ArrayList<ContaComum> contasComuns = new ArrayList<>();
		List<ContaEspecial> contasEspeciais = new ArrayList<>();
		
		ContaComum contaAtualC = new ContaComum(0, "padrão");
		ContaEspecial contaAtualE = new ContaEspecial(0, "padrão");
		
		//menuzinho genérico
		while(true){
			System.out.println("1 - Criar uma conta.");
			System.out.println("2 - Entrar em uma conta.");
			System.out.println("0 - Sair!");
			int opcao = inputMenu.nextInt();
			int numConta;
			String nome;
			float saldo;
			
			
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
						//VERIFICAR NUMERO CONTA EXISTENTE
						if(contasComuns.size()>0){
							for(ContaComum cC: contasComuns){
								if(numConta == cC.getNumeroConta()){
									System.out.println("\nNumero de conta em uso!\n");
									break;
								} else {
									ContaComum contabraba = new ContaComum(numConta, nome);
									contasComuns.add(contabraba);
									contabraba.toString();
									System.out.println("\nConta criada com sucesso!\n");
								}
							}
						} else {
									ContaComum contabraba = new ContaComum(numConta, nome);
									contasComuns.add(contabraba);
									contabraba.toString();
									System.out.println("\nConta criada com sucesso!\n");
						}
					} else if (opcao == 2) {
						//construtor conta especial, retornar num da conta
						if(contasEspeciais.size()>0){
							for(ContaEspecial cE: contasEspeciais){
								if(numConta == cE.getNumeroConta()){
									System.out.println("\nNumero de conta em uso!\n");
									break;
								} else {
									ContaEspecial contabrabona = new ContaEspecial(numConta, nome);
									contasEspeciais.add(contabrabona);
									contabrabona.toString();
									System.out.println("\nConta criada com sucesso!\n");
								}
							}
						} else {
									ContaEspecial contabrabona = new ContaEspecial(numConta, nome);
									contasEspeciais.add(contabrabona);
									contabrabona.toString();
									System.out.println("\nConta criada com sucesso!\n");
						}
					} else {
						System.out.println("");
						System.out.println("Opção inválida! Tente novamente.");
						System.out.println("");
						
						break;
					}
					
					break;
				case 2:
					System.out.print("Digite o tipo de conta, 1 para comum, 2 para especial: ");
					opcao = inputMenu.nextInt();
				
					if(opcao == 1 && contasComuns.size()>0){
						System.out.print("Digite o número da conta: ");
						opcao = inputMenu.nextInt();
						//procurar nas instancias de contas por esse número
						for(ContaComum cC: contasComuns){
							if(opcao == cC.getNumeroConta()){
								contaAtualC = cC;
								while(true){
									System.out.println("1 - Realizar Depósito.");
									System.out.println("2 - Realizar Saque.");
									System.out.println("3 - Realizar Transferencia.");
									System.out.println("4 - Ver Informações.");
									System.out.println("0 - Voltar.");
									
									opcao = inputMenu.nextInt();
									
									switch (opcao){
										case 1:
											System.out.print("Digite o valor a ser depositado: ");
											saldo = inputMenu.nextFloat();
											contaAtualC.depositar(saldo);
											break;
										case 2:
											System.out.print("Digite o valor a ser sacado: ");
											saldo = inputMenu.nextFloat();
											contaAtualC.sacar(saldo);
											break;
										case 3:
											System.out.print("Digite o tipo de conta que deseja realizar a tranferencia: ");
											opcao = inputMenu.nextInt();
											
											System.out.print("Digite o número da conta: ");
											numConta = inputMenu.nextInt();
											
											System.out.print("Digite o valor da tranferencia: ");
											saldo = inputMenu.nextFloat();
											
											if(opcao == 1) {
												//VERIFICAR NUMERO CONTA EXISTENTE
												if(contasComuns.size()>0){
													for(ContaComum c: contasComuns){
														if(numConta == c.getNumeroConta()){
															Conta contaDestinoC = c;
															if(contaAtualC.transferePara(contaDestinoC, saldo)){
																System.out.println("Transação Concluida!");
															} else {
																System.out.println("Falha na Transação!");
															}
															
															break;
														} else {
															System.out.println("");
															System.out.println("Conta inválida! Tente novamente.");
															System.out.println("");
														}
													}
												} else {
													System.out.println("");
													System.out.println("Conta inválida! Tente novamente.");
													System.out.println("");
												}
											} else if (opcao == 2) {
												for(ContaEspecial e: contasEspeciais){
														if(numConta == e.getNumeroConta()){
															Conta contaDestinoE = e;
															if(contaAtualC.transferePara(contaDestinoE, saldo)){
																System.out.println("Transação Concluida!");
															} else {
																System.out.println("Falha na Transação!");
															}
															break;
														} else {
															System.out.println("");
															System.out.println("Conta inválida! Tente novamente.");
															System.out.println("");
														}
													}
												if(contasEspeciais.size()>0){

												} else {
													System.out.println("");
													System.out.println("Conta inválida! Tente novamente.");
													System.out.println("");
												}
											} else {
												System.out.println("");
												System.out.println("Opção inválida! Tente novamente.");
												System.out.println("");
												
												break;
											}
											
											break;
										case 4:
											System.out.println(contaAtualC.toString());
											break;
										case 0:
											break;
										default:
											System.out.println("Opção Inválida");
											break;
									}
									break;
								}
							} else {
								System.out.println("Conta inválida!");
								break;
							}
						}
					} else if (opcao == 2 && contasEspeciais.size()>0){ //mesma coisa pra contas especiais
						System.out.print("Digite o número da conta: ");
						opcao = inputMenu.nextInt();
						for(ContaEspecial cE: contasEspeciais){
							if(opcao == cE.getNumeroConta()){
								contaAtualE = cE;
								while(true){
									System.out.println("1 - Realizar Depósito.");
									System.out.println("2 - Realizar Saque.");
									System.out.println("3 - Realizar Transferencia.");
									System.out.println("4 - Ver Informações.");
									System.out.println("0 - Voltar.");
									
									opcao = inputMenu.nextInt();
									
									switch (opcao){
										case 1:
											System.out.print("Digite o valor a ser depositado: ");
											saldo = inputMenu.nextFloat();
											contaAtualE.depositar(saldo);
											break;
										case 2:
											System.out.print("Digite o valor a ser sacado: ");
											saldo = inputMenu.nextFloat();
											contaAtualE.sacar(saldo);
											break;
										case 3:
											System.out.print("Digite o tipo de conta que deseja realizar a tranferencia: ");
											opcao = inputMenu.nextInt();
											
											System.out.print("Digite o número da conta: ");
											numConta = inputMenu.nextInt();
											
											System.out.print("Digite o valor da tranferencia: ");
											saldo = inputMenu.nextFloat();
											
											if(opcao == 1) {
												//VERIFICAR NUMERO CONTA EXISTENTE
												if(contasComuns.size()>0){
													System.out.println("");
													System.out.println("Conta inválida! Tente novamente.");
													System.out.println("");
												} else {
													
												}
											} else if (opcao == 2) {
												
												if(contasEspeciais.size()>0){

												} else {
													System.out.println("");
													System.out.println("Conta inválida! Tente novamente.");
													System.out.println("");
												}
											} else {
												System.out.println("");
												System.out.println("Opção inválida! Tente novamente.");
												System.out.println("");
												
												break;
											}
											
											break;
										case 4:
											System.out.println(contaAtualE.toString());
											break;
										case 0:
											break;
										default:
											System.out.println("Opção Inválida");
											break;
									}
									break;
								}
							} else {
								System.out.println("Conta inválida!");
								break;
							}
						}
					} else {
						System.out.println("");
						System.out.println("Não existem contas com os seguintes parametros! Tente novamente mais tarde.");
						System.out.println("");
						
						break;
					}
					
					
					break;
				default:
					System.out.println("Opção Inválida");
					break;
				case 0:
					return;
			}
		}
	}
	
}