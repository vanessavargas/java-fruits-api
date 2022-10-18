package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMySQL {
	//CONFIGURANDO A CONEXÃO COM O BANCO DE DADOS
	private static String URL = "jdbc:mysql://localhost:3306/fruteira";
	private static String USUARIO = "root";
	private static String SENHA = "mysql@pc";
	
	public static Connection createConnectionMySQL() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection (URL, USUARIO, SENHA);
		return connection;
	}
	
	//RODANDO A CONEXÃO
	public static void main(String[] args) throws Exception {
		Connection con = createConnectionMySQL();
		
		if (con!= null) {
			System.out.println(con + "\n\nConexão OK!");
			con.close();
		}
	}
}
