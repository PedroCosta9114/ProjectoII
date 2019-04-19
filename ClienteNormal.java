package Projetoii;

public abstract class ClienteNormal extends Cliente {

	public ClienteNormal(String nomedapessoa, String sexodapessoa, String sexo2dapessoa, int idadedapessoa) {
		super(nomedapessoa, sexodapessoa, sexo2dapessoa, idadedapessoa);
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
		String moradadoclienten;
		String emaildoclienten;
		String profissaodoclienten;
		long telefonedoclienten;
		long numerointernobancodoclienten;
	}
	
	@Override
	public void sairdoprograma () {
		String sairdoprogramacn = "Sair do programa";
	}
	
	
	public  void contaaordem () {
		String levantamentos = "Levantamentos";
		String transferencias  = "transferencias";
		String depositos = "depositos";
		long numerodacontaordem;
		
	}
	
	public  void contapoupança () {
		String transferencias = "transferencias";
		String renumeracao  = "Renumeracao";
		long numerodacontapoupanca;
		
	}

}

