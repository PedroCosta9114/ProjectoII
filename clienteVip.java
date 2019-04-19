package Projetoii;

public class clienteVip extends Cliente {

	public clienteVip () {
	}
	public clienteVip(String nomedapessoa, String sexodapessoa, String sexo2dapessoa, int idadedapessoa) {
		super.nomedapessoa = new String ();
		super.sexodapessoa = "Masculino";
		super.sexo2dapessoa = "Feminino";
		super.idadedapessoa = idadedapessoa;
		}
	
	@Override
	public void dadosdocliente () {
		String nomedocliente = Cliente.nomedapessoa;
		String sexodocliente = Cliente.sexodapessoa;
		String sexo2docliente = Cliente.sexo2dapessoa;
		int idadedocliente = Cliente.idadedapessoa;
		String moradadocliente;
		String emaildocliente;
		String profissaodocliente;
		long telefonedocliente;
		long numerointernobancodocliente;
	}
	@Override
	public void sairdoprograma () {
		String clientensair = "Sair do programa";
	}

	@Override
	public  void contaaordem () {
		String levantamentos = "Levantamentos";
		String depositos = "Depositos";
		String transferencias  = "Transferencias";

	}
	
	public  void contapoupança () {
		String transferencias  = "Transferencias";
		String renumeracao = "Renumeracao";
	}

	public  void contadeinvestimento () {
		String levantamentos = "Levantamentos";
		String transferencias  = "Transferencias";
	}

}
	
	
	
	
	
		
	

