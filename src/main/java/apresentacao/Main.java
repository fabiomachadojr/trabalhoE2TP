package apresentacao;


import javax.swing.JOptionPane;
import dto.ContaVO;
import negocio.ContaBancariaServico;


public class Main {

	public static void main(String[] args) {

				
		CadastroContaBancariaView  cadastroContaBancariaView = new CadastroContaBancariaView();
		ContaBancariaServico contaBancariaServico = new ContaBancariaServico();
		
		while(true) {
			String operacao = JOptionPane.showInputDialog("escolha a opcao\n"
					+ "1. cadastrar conta\n"
					+ "2.depositar\n"
					+ "3.sacar\n"
					+ "4.sair");
			if(operacao.equals("1")) {		
				ContaVO conta =  cadastroContaBancariaView.cadastrarConta();
				contaBancariaServico.cadastraConta(conta);
	
			}else if(operacao.equals("2")) {
				ContaVO conta = cadastroContaBancariaView.depositar();
				try {
					contaBancariaServico.depositar(conta);
					JOptionPane.showMessageDialog(null, "Deposito efetuado com sucesso");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				
			}else if(operacao.equals("3")) {
				ContaVO conta = cadastroContaBancariaView.sacar();
				try {
					contaBancariaServico.sacar(conta);
					JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
			else if(operacao.equals("4")) {
				System.exit(1);
			}
			
			
			
		}
		
	}

}
