package Projetoii;

public class Cartaodecredito extends Conta{
	
	long numerodocartao;
	double custo;
	
	public Cartaodecredito (String nomedapessoa, String sexodapessoa, String sexo2dapessoa, int idadedapessoa) {
		super(nomedapessoa, sexodapessoa, sexo2dapessoa, idadedapessoa);
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
	public void pagamentos () {
		String datadepagamento;	
		double montanteapagar;
		String mododepagamento1 = "Pagamento de Impostos";
		String mododepagamento2 = "Pagamento de Telecomunicacoes";
		String mododepagamento3 = "Pagamento de Servicos de Compras";
			}
	public void levantamentos () {
		double levantamentos20e = 20.00;
		double levantamentos50e = 50.00;
		double levantamentos100e = 100.00;
		
	}
	
	public double [] levantamentosoutrasimportancias = 
		{10.00,15.00,20.00,25.00,30.00,35.00,40.00,45.00,50.00,55.00,60.00,65.00,70.00,75.00,80.00,85.00,90.00,95.00};
		
	public void display () {
		System.out.println (levantamentosoutrasimportancias [0]);
		System.out.println (levantamentosoutrasimportancias [1]);
		System.out.println (levantamentosoutrasimportancias [2]);
		System.out.println (levantamentosoutrasimportancias [3]);
		System.out.println (levantamentosoutrasimportancias [4]);
		System.out.println (levantamentosoutrasimportancias [5]);
		System.out.println (levantamentosoutrasimportancias [6]);
		System.out.println (levantamentosoutrasimportancias [7]);
		System.out.println (levantamentosoutrasimportancias [8]);
		System.out.println (levantamentosoutrasimportancias [9]);
		System.out.println (levantamentosoutrasimportancias [10]);
		System.out.println (levantamentosoutrasimportancias [11]);
		System.out.println (levantamentosoutrasimportancias [12]);
		System.out.println (levantamentosoutrasimportancias [13]);
		System.out.println (levantamentosoutrasimportancias [14]);
		System.out.println (levantamentosoutrasimportancias [15]);
		System.out.println (levantamentosoutrasimportancias [16]);
		System.out.println (levantamentosoutrasimportancias [17]);
	}	
}