package entidades;

import java.util.ArrayList;
import java.util.List;

import classes.Conta;

public class Contas_Banco {
	
	private List<Conta> contas = new ArrayList<Conta>();

	public Contas_Banco() {

	}

	public List<Conta> getContas() {
		return contas;
	}

	public void Adicionar(Conta conta) {
		contas.add(conta);
	}
	
	public void Remover(int num_conta) {
		for(int i = 0; i <= contas.size(); i++) {
			
			if(num_conta == contas.get(i).getNumero()) {
				contas.remove(i);
				break;
			}
			
		}
	}

}
