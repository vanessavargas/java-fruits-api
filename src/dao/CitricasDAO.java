package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import model.Citricas;

public class CitricasDAO {
	
	Connection conn = null;
	PreparedStatement pstm = null;
	
	//CREATE
	public void save (Citricas citrica) {
		String sql = "INSERT INTO citricas (nomeFruta, precoFruta) VALUES (?,?);";
		
		try {
			//CRIAR A CONEXAO COM O BANCO DE DADOS
			conn = ConnectionMySQL.createConnectionMySQL();
			
			//CRIAR O PREPAREDSTATEMENT
			pstm = conn.prepareStatement(sql);
			
			//ADICIONAR OS PARÂMETROS
			pstm.setString(1, citrica.getNomeFruta());
			pstm.setDouble(2, citrica.getPrecoFruta());
			
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
	
	//READ
	public List<Citricas> getCitricas() {
		String sql = "SELECT * FROM citricas;";
		
		List<Citricas> citricas = new ArrayList<Citricas>();
		
		//RECUPERANDO OS DADOS DO BD
		ResultSet rset = null;
		
		//CONECTANDO
		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			//LER AS INFORMACOES DO BD E TRAZER PRA CÁ
			while (rset.next()) {
				Citricas citrica = new Citricas (0, sql, 0);
				
				citrica.setId(rset.getInt("id"));
				citrica.setNomeFruta(rset.getString("nomeFruta"));
				citrica.setPrecoFruta(rset.getDouble("precoFruta"));
				
				citricas.add(citrica);
			}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (rset != null) {
						rset.close();
					}
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
		return citricas;
	}
	
	//UPDATE
	public void update(Citricas citrica) {
		String sql = "UPDATE citricas SET nomeFruta = ?, precoFruta = ? WHERE id = ?;";
		
		//CONECTANDO
				try {
					conn = ConnectionMySQL.createConnectionMySQL();
					pstm = conn.prepareStatement(sql);
					
					//ADICIONAR OS PARAMETROS
					pstm.setString(1, citrica.getNomeFruta());
					pstm.setDouble(2, citrica.getPrecoFruta());
					pstm.setInt(3, citrica.getId());
					//EXECUTAR
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
	
	//DELETE
	public void delete (int id) {
		String sql = "DELETE FROM citricas WHERE id = ?;";
		
		//CONECTANDO
		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);
			
			//INDICA O PARAMETRO PARA EXCLUIR
			pstm.setInt(1, id);
			
			//EXECUTAR
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
