package com.unab.MonitoreoDeFinanzasPersonales.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;



@Document("balances")
public class Balances {
	@Id
	private String id;
	
	@Field("ingreso")
	private String ingreso;
	
	@Field("egreso")
	private String egreso;
	
	@Field("balanceTotal")
	private Long balanceTotal;
	
	@DBRef
	private Movimientos movimientos;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIngreso() {
		return ingreso;
	}

	public void setIngreso(String ingreso) {
		this.ingreso = ingreso;
	}

	public String getEgreso() {
		return egreso;
	}

	public void setEgreso(String egreso) {
		this.egreso = egreso;
	}

	public Long getBalanceTotal() {
		return balanceTotal;
	}

	public void setBalanceTotal(Long balanceTotal) {
		this.balanceTotal = balanceTotal;
	}

	public Movimientos getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(Movimientos movimientos) {
		this.movimientos = movimientos;
	}
	

}
