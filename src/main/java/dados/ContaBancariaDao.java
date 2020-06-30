package dados;

import java.util.ArrayList;

import dominio.Conta;

// CAMADA DE DADOS
public class ContaBancariaDao {

	ArrayList<Conta> bancoDeDados = new ArrayList<Conta>();
	
	public void cadastrarContaBancaria(Conta conta) {
		bancoDeDados.add(conta);
	}
	
	public int consultaContaBancaria(int numeroConta) {	
		int consultaConta = -1;
		for (int i = 0; i < bancoDeDados.size(); i++) {
			if (bancoDeDados.get(i).getNumeroConta() == numeroConta) {
				consultaConta = i;
			}
		}	
		return consultaConta;	
	}
	
	public void atualizarContaBancaria(int indiceConta, float saldo) {
		bancoDeDados.get(indiceConta).setSaldo(bancoDeDados.get(indiceConta).getSaldo()+saldo);
	}
	
	public void sacarContaBancaria(int indiceConta, float valor) {
		bancoDeDados.get(indiceConta).setSaldo(bancoDeDados.get(indiceConta).getSaldo()-valor);
	}
	
	public float consultaSaldoContaBancaria(int indiceConta) {
		return bancoDeDados.get(indiceConta).getSaldo();
	}
		
	
	
}
