package model;

import java.sql.Date;

public class Citricas extends Frutas {
	//ATRIBUTORES
	private String origem;

	//CONSTRUTORES
	public Citricas(int id, String nomeFruta, double precoFruta, Date validade, String origem) {
		super(id, nomeFruta, precoFruta, validade);
		this.origem = origem;
	}
	
	public Citricas (int id, String nomeFruta, double precoFruta) {
		super (id, nomeFruta, precoFruta);
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}
		
}
