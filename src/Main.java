import java.util.Scanner;

import classes.Conta;
import entidades.Contas_Banco;
import entidades.Menu_Principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Menu_Principal menu = new Menu_Principal();
		Conta conta;
		Contas_Banco contas_abertas = new Contas_Banco();
		
		int num_conta, exec, op;
		String nome_cliente;
		double valor;
		char dep;
		
		exec = 0;
		
		do {
			
			System.out.println(menu.toString());
			op = scan.nextInt();
			
			if(op == 7) {
				exec++;
			} else {
				
				if(op == 1) {
					
					System.out.println("\nCADASTRAR NOVA CONTA");
					System.out.print("Número da Conta: ");
					num_conta = scan.nextInt();
					System.out.print("Nome do títular: ");
					scan.nextLine();
					nome_cliente = scan.nextLine();
					
					System.out.print("Deseja fazer um depósito inicial? (s/n) ");
					dep = scan.next().charAt(0);
					
					if(dep == 's') {
						System.out.print("Digite o valor do depósito: ");
						valor = scan.nextDouble();
						
						conta = new Conta(num_conta, nome_cliente, valor);
					} else {
						conta = new Conta(num_conta, nome_cliente);
					}
					
					contas_abertas.Adicionar(conta);
					
				} else if(op == 2){
					
					System.out.println("\nALTERAÇÃO DE CONTA");
					System.out.print("Digite o número da conta: ");
					num_conta = scan.nextInt();
					
					for (int i = 0; i <= contas_abertas.getContas().size(); i++) {
						conta = contas_abertas.getContas().get(i);
						
						if(num_conta == conta.getNumero()) {
							System.out.println(conta.getNumero());
							System.out.println(conta.getNome());
							System.out.println(conta.getSaldo());
							System.out.print("Deseja alterar o nome? ");
							dep = scan.next().charAt(0);
							
							if (dep == 's') {
								System.out.print("Digite o novo nome: ");
								scan.nextLine();
								nome_cliente = scan.nextLine();
								contas_abertas.Alteracao(num_conta, nome_cliente);
								
								break;
							}
						}
					}
					
					
				} else if(op == 3){
					
					System.out.println("\nFAZER DEPÓSITO");
					System.out.print("Digite a conta: ");
					num_conta = scan.nextInt();
					
					for (int i = 0; i <= contas_abertas.getContas().size(); i++) {
						conta = contas_abertas.getContas().get(i);
						
						if(num_conta == conta.getNumero()) {
							System.out.println(conta);
							System.out.print("Digite o valor a ser depositado: ");
							valor = scan.nextDouble();
							
							contas_abertas.FazerDeposito(num_conta, valor);
							
							System.out.println(contas_abertas.getContas().get(i));
							System.out.println("Depósito realizado!");
							
							break;
						}
					}
					
				} else if(op == 4){
					
					System.out.println("\nFAZER SAQUE");
					System.out.print("Digite a conta: ");
					num_conta = scan.nextInt();
					
					for (int i = 0; i <= contas_abertas.getContas().size(); i++) {
						conta = contas_abertas.getContas().get(i);
						
						if(num_conta == conta.getNumero()) {
							System.out.println(conta);
							System.out.print("Digite o valor a ser sacado: ");
							valor = scan.nextDouble();
							
							contas_abertas.FazerSaque(num_conta, valor);
							
							System.out.println(contas_abertas.getContas().get(i));
							System.out.println("Saque realizado!");
							
							break;
						}
					}
					
				} else if (op == 5){
					
					for (int i = 0; i < contas_abertas.getContas().size(); i++) {
						System.out.println(contas_abertas.getContas().get(i));
					}
					
				} else {
					
					System.out.println("\nFECHAR CONTA");
					System.out.print("Digite a conta: ");
					num_conta = scan.nextInt();
					
					for (int i = 0; i <= contas_abertas.getContas().size(); i++) {
						contas_abertas.Remover(num_conta);
						System.out.println("CONTA FECHADA!");
						break;
						
					}
					
				}
				
			}
			
		}while(exec == 0);
		
		System.exit(0);

	}

}
