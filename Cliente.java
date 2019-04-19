package Projetoii;

public class Cliente extends Pessoa{
	protected String moradadocliente;
	protected String emaildocliente;
	protected String profissaodocliente;
	protected long telefonedocliente;
	protected long numerointernobancodocliente;
	protected String sexodocliente; 
	protected String sexo2docliente;

	public Cliente(String nomedapessoa, String sexodapessoa, String sexo2dapessoa, int idadedapessoa) {
		super.nomedapessoa = new String ();
		super.sexodapessoa = "Masculino";
		super.sexo2dapessoa = "Feminino";
		super.idadedapessoa = idadedapessoa;

	}
	
	public Cliente () {
		
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

	public void contaaordem() {
		// TODO Auto-generated method stub
		
	}
	
	public void contapoupança() {
		// TODO Auto-generated method stub
		
	}
	
	public void contadeinvestimento() {
		// TODO Auto-generated method stub
		
	}


}






