//DIRETÓRIO
package model;

import java.sql.Date;

//CLASSE
public class Frutas {
	//ATRIBUTOS
	private int id;
	private String nomeFruta;
	private double precoFruta;
	private Date validade;

	//CONSTRUTORES
	public Frutas(int id, String nomeFruta, double precoFruta, Date validade) {
		super();
		this.id = id;
		this.nomeFruta = nomeFruta;
		this.precoFruta = precoFruta;
		this.validade = validade;
	}
	
	public Frutas () {
		
	}
	
	public Frutas (int id, String nomeFruta, double precoFruta) {
		this.id = id;
		this.nomeFruta = nomeFruta;
		this.precoFruta = precoFruta;
	}

	//GETTERS E SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeFruta() {
		return nomeFruta;
	}

	public void setNomeFruta(String nomeFruta) {
		this.nomeFruta = nomeFruta;
	}

	public double getPrecoFruta() {
		return precoFruta;
	}

	public void setPrecoFruta(double precoFruta) {
		this.precoFruta = precoFruta;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
	
	
	

}
