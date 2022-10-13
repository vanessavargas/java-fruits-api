package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.ConnectionMySQL;
import model.Citricas;

public class CitricasDAO {
	
	Connection conn = null;
	PreparedStatement pstm = null;
	
	//CREATE
	public void save (Citricas citrica) {
		String sql = "INSERT INTO citricas (nomeFruta, precoFruta) VALUES (?, ?);";
		
		try {
			//CRIAR A CONEXAO COM O BANCO DE DADOS
			conn = ConnectionMySQL.createConnectionMySQL();
			
			//CRIAR O PREPAREDSTATEMENT
			pstm = conn.prepareStatement(sql);
			
			//EXECUTAR O COMANDO SQL PARA INSERIR OS DADOS
			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
