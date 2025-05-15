package negocio;

import persistencia.PessoaDAO;

public class Pessoa {
	//  Propriedades da classe
	private int id = 0;
	private String nome = "";
	private String endereco = "";
	private String telefone = "";
	
	// Construtores
	public Pessoa(int id, String nome, String endereco, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public Pessoa() {
		super();
	}
	
	//Get e Set
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//Método da classe
	public void persistir() throws Exception {
		new PessoaDAO().persistir(this);
	}
}
