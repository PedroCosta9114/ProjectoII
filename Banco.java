package Projetoii;

public abstract class Banco {
	protected static String nomedapessoa;
	protected static String sexodapessoa; 
	protected static String sexo2dapessoa; 
	protected static int idadedapessoa; 

	public Banco () {
	
	}
	public Banco (String nomedapessoa, String sexodapessoa, String sexo2dapessoa, int idadedapessoa) {
		this.nomedapessoa = nomedapessoa;
		this.sexodapessoa  = sexodapessoa;
		this.sexo2dapessoa = sexo2dapessoa;
		this.idadedapessoa = idadedapessoa;	
	}
		

	}


