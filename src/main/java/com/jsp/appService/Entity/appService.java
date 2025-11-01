package com.jsp.appService.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="app_service")
public class appService {
	
	@Id
	@GenericGenerator(name="reg_auto",strategy = "increment")
	@GeneratedValue(generator = "reg_auto")
	@Column(name="Alt_Key")
	int altkey;
	
	@Column(name="service_name", unique=true)
	String serviceName;
	
	@Column(name="service_url")
	String serviceUrl;
	
	@Column(name="status")
	String status;
	
	@Column(name="created_date")
	Date createdDate;
	
	@Column (name="modified_date")
	Date modifiedDate;

	public int getAltkey() {
		return altkey;
	}

	public void setAltkey(int altkey) {
		this.altkey = altkey;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceUrl() {
		return serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
