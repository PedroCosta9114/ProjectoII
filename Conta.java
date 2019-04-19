package Projetoii;

public  class Conta extends Cliente {
	
	public Conta (String nomedapessoa, String sexodapessoa, String sexo2dapessoa, int idadedapessoa) {
		this.nomedapessoa = nomedapessoa;
		this.sexodapessoa  = sexodapessoa;
		this.sexo2dapessoa = sexo2dapessoa;
		this.idadedapessoa = idadedapessoa;	
	}
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
	
	
	
	public  void contaaordem () {
		long numerodacontaaordem;
		String levantamentos = "Levantamentos";
		String depositos = "Depositos";
		String transferencias  = "Transferencias";

	}
	
	public  void contapoupança () {
		long numerodacontapoupança;
		String transferencias  = "Transferencias";
		String renumeracao = "Renumeracao";
	}

	public  void contadeinvestimento () {
		String gestodeConta;
		long numerodacontainvestimento;
		String levantamentos = "Levantamentos";
		String transferencias  = "Transferencias";
		double Custo;
	}
}
