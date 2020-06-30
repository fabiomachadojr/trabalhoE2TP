package apresentacao;

import javax.swing.JOptionPane;

import dto.ContaVO;

public class CadastroContaBancariaView {
	

	public ContaVO cadastrarConta() {
		
		String numeroConta = JOptionPane.showInputDialog("digite o n. da conta: ");
		String nomeCorrestista = JOptionPane.showInputDialog("digite o nome do correntista: ");
		String saldo = JOptionPane.showInputDialog("digite o saldo inicial R$: ");
		ContaVO contaVo = new ContaVO();
		contaVo.setNomeCorrestista(nomeCorrestista);
		contaVo.setNumeroConta(Integer.parseInt(numeroConta));
		contaVo.setSaldo(Float.parseFloat(saldo));
		return contaVo;
		
	}
	
	public ContaVO depositar() {
		
		String numeroConta = JOptionPane.showInputDialog("digite o n. da conta: ");
		String saldo = JOptionPane.showInputDialog("digite o valor para deposito R$: ");
		ContaVO contaVo = new ContaVO();
		contaVo.setNumeroConta(Integer.parseInt(numeroConta));
		contaVo.setSaldo(Float.parseFloat(saldo));
		return contaVo;
		
	}
	
	public ContaVO sacar() {
		
		String numeroConta = JOptionPane.showInputDialog("digite o n. da conta: ");
		String saldo = JOptionPane.showInputDialog("digite o valor para saque inicial R$: ");
		ContaVO contaVo = new ContaVO();
		contaVo.setNumeroConta(Integer.parseInt(numeroConta));
		contaVo.setSaldo(Float.parseFloat(saldo));
		return contaVo;
		
	}
	
}
