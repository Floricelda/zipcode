package com.java.test.zipcode.models;
/***************************************************************************************************************/
/* Date: 16/05/2021
 * Author: Floricelda Cabrera Santos
 * Descripción: pojo creado para el retorno de datos como se especificó en otras ocasiones se pueden retornar
 * las entidades mapeadas de la base de datos*/
/***************************************************************************************************************/
public class Settlements {
	private String name;
	private String zone_type;
	private String settlement_type;

	public Settlements() {

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZone_type() {
		return zone_type;
	}
	public void setZone_type(String zone_type) {
		this.zone_type = zone_type;
	}
	public String getSettlement_type() {
		return settlement_type;
	}
	public void setSettlement_type(String settlement_type) {
		this.settlement_type = settlement_type;
	}

}
