package com.multiva.cecoban.transactionlog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long solicitudId;
	private String originUrl;
	
	public Long getSolicitudId() {
		return solicitudId;
	}
	public String getOriginUrl() {
		return originUrl;
	}
	public void setOriginUrl(String originUrl) {
		this.originUrl = originUrl;
	}
	public void setSolicitudId(Long solicitudId) {
		this.solicitudId = solicitudId;
	}
}
