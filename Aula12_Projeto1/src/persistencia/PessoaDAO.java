package persistencia;

import java.sql.PreparedStatement;

import negocio.Pessoa;

public class PessoaDAO {
	// Propriedades da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	
	// Métodos da classe
	public void persistir(Pessoa objPessoa) throws Exception {
		objBanco.conectar();
		
		objExecucao = objBanco.getobjConexao().prepareStatement("INSERT INTO pes_pessoa " + 
																"(pes_nome, pes_endereco, pes_telefone) " + 
																"VALUES " +
																"(?, ?, ?)");
		objExecucao.setString(1, objPessoa.getNome());
		objExecucao.setString(2, objPessoa.getEndereco());
		objExecucao.setString(3, objPessoa.getTelefone());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}
}
