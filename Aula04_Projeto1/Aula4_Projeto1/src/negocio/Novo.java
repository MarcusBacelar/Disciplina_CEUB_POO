package negocio;

public class Novo extends Imovel{//IMPORANTE! "extends" -> Diz que a classe Novo é FILHA da outra classe, no caso, Imovel.

	//Propriedades da classe
	private double adicional = 0;

	
	
		
		public Novo() { //Construtor vazio
		super();
	}

		
		
	
		
	public Novo(String endereco, double metragem, double valor, double adicional) { //Construtor Cheio
			super(endereco, metragem, valor);
			this.adicional = adicional;
		}




 //Metodos de acesso da classe
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	
	//Metodos sobrescritos da hierarquia
	public double getValor() {
		return (super.getValor() + this.getAdicional());
	}
	
}
