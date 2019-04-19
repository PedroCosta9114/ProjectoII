package Projetoii;

import java.util.Scanner;

public class Main extends Cartaodecredito {
	static String novocliente = "Pedro Costa";
	public Main(String nomedapessoa, String sexodapessoa, String sexo2dapessoa, int idadedapessoa) {
		super(sexo2dapessoa, sexo2dapessoa, sexo2dapessoa, idadedapessoa);
		this.nomedapessoa = novocliente;
		this.sexodapessoa  = sexodapessoa;
		this.idadedapessoa = idadedapessoa;
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
		public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
			System.out.println ("Nome: ");
			String nomedocliente = novocliente;
			System.out.println ("Sexo: ");
			String sexodocliente = sexodapessoa;
			System.out.println ("Idade: ");
			int idade = 28;
			System.out.println ("Morada: ");
			String morada = "Rua Sol, nº25";
			System.out.println ("Email: ");
			String email = "pmcosta1491@gmail.com";
			System.out.println ("Profissão: ");
			String profissao = "Desempregado";
			System.out.println ("Telefone: ");
			long telefone = 678900939L;
			System.out.println ("Número Interno do Banco:  ");
			long numerointernodobanco = 798_789_345;
		
		}
		double [] levantamentosoutrasimportancias = {10.00,15.00,20.00,25.00,30.00,35.00,40.00,45.00,50.00,55.00,60.00,65.00,70.00,75.00,80.00,85.00,90.00,95.00};
		public void display () {
			
			System.out.println (levantamentosoutrasimportancias [2]);
			
		}		

	}


