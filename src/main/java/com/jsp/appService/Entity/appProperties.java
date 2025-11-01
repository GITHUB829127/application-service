package com.jsp.appService.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name="appProperties")
public class appProperties {

	@Id
	@GenericGenerator(name="reg_auto",strategy = "increment")
	@GeneratedValue(generator = "reg_auto")
	@Column(name="Alt_Key")
	int altkey;
	
	@Column(name="module_Name", nullable=false)
	String moduleName;
	
	@Column(name="property_Key", unique=true)
	String propertyKey;
	
	@Column(name="propert_value", nullable=false)
	String propertyValue;
	
	
	@Column(name="created_Date", nullable=true)
	Date createdDate;
	
	@Column(name="modified_date", nullable=true)
	Date modifiedDate;
	
	@Column(name="created_By")
	String createdBy;
	
	@Column(name="modified_By")
	String modifiedBy;

	public int getAltkey() {
		return altkey;
	}

	public void setAltkey(int altkey) {
		this.altkey = altkey;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getPropertyKey() {
		return propertyKey;
	}

	public void setPropertyKey(String propertyKey) {
		this.propertyKey = propertyKey;
	}

	public String getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	
	
}
