package conversores;

import dominio.Conta;
import dto.ContaVO;

public class ContaConversor {

	public ContaVO paraVO(Conta dominio) {
		ContaVO contaVO = new ContaVO();

		contaVO.setNomeCorrestista(dominio.getNomeCorrestista());
		contaVO.setNumeroConta(dominio.getNumeroConta());
		contaVO.setSaldo(dominio.getSaldo());
		
		return contaVO;
		
	}
	
	public Conta paraDominio(ContaVO contaVO) {
		Conta conta = new Conta();
		
		conta.setNomeCorrestista(contaVO.getNomeCorrestista());
		conta.setNumeroConta(contaVO.getNumeroConta());
		conta.setSaldo(contaVO.getSaldo());
	
		return conta;
	}
	
}
