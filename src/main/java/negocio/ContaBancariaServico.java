package negocio;

import conversores.ContaConversor;
import dados.ContaBancariaDao;
import dto.ContaVO;

public class ContaBancariaServico {

	ContaBancariaDao contaBancariaDao = new ContaBancariaDao();
	ContaConversor conversor = new ContaConversor();

	public void cadastraConta(ContaVO conta) {
		contaBancariaDao.cadastrarContaBancaria(conversor.paraDominio(conta));
	}

	public void depositar(ContaVO conta) throws Exception {
		int consultaConta = contaBancariaDao.consultaContaBancaria(conta.getNumeroConta());
		int contaInexistente = -1;
		if (consultaConta == contaInexistente) {
			throw new Exception("Conta inexistente!");
		} else {
			contaBancariaDao.atualizarContaBancaria(consultaConta, conta.getSaldo());
		}
		
	}

	public void sacar(ContaVO conta) throws Exception {
		int consultaConta = contaBancariaDao.consultaContaBancaria(conta.getNumeroConta());
		int contaInexistente = -1;
		if (consultaConta == contaInexistente) {
			throw new Exception("Conta inexistente!");
		} else {
			float saldo = contaBancariaDao.consultaSaldoContaBancaria(consultaConta);
			if (saldo < conta.getSaldo()) {
				throw new Exception("Saldo insuficiente!");
			}else {
			contaBancariaDao.sacarContaBancaria(consultaConta, conta.getSaldo());
			}
		}
		
	}

}
