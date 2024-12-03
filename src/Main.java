import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Conta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Conta conta;
		List<Conta> contas = new ArrayList<Conta>();
		
		int num_conta, exec, op;
		String nome_cliente;
		double valor;
		
		exec = 0;
		
		do {
			
			conta = new Conta(1, "Amanda");
			contas.add(conta);
			conta = new Conta(2, "Diego", 500);
			contas.add(conta);
			
			for(int i = 0; i < contas.size(); i++) {
				System.out.println(contas.get(i).toString());
			}
			
			System.out.println("Qual Conta deseja alterar?");
			int num = scan.nextInt();
			
			for(int i = 0; i < contas.size() + 1; i++) {
				
				if(num == contas.get(i).getNumero()) {
					
					System.out.println("Digite o novo nome: ");
					scan.nextLine();
					nome_cliente = scan.nextLine();
					
					contas.get(i).setNome(nome_cliente);
					
					break;
					
				}
				
			}
			
			for(int i = 0; i < contas.size(); i++) {
				System.out.println(contas.get(i).toString());
			}
			
			exec++;
			
		}while(exec == 0);

	}

}
