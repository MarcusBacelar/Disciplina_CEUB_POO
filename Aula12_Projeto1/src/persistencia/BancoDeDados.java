package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDeDados {
	//propriedades da classe
	private Connection objConexao = null;
	
	//métodos da classe
	void conectar() throws Exception {
		objConexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/aula-12?"
				+ "user=root&password=ceub123456&"
				+ "serverTimezone=UTC&useSSL=false");
	}
	
	void desconectar() throws Exception {
		objConexao.close();
	}
	
	Connection getobjConexao() {
		return objConexao;
	}
}
