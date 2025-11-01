package com.jsp.appService.Dto;

import java.io.Serializable;
import java.util.Date;

public class AppPropertiesDto implements Serializable {

	 String moduleName;
	 String propertyKey;
	 String propertyValue;
	 Date createdDate;
	 Date modifiedDate;
	 String creatededBy;
	 String modifiedBy;
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
	public String getCreatededBy() {
		return creatededBy;
	}
	public void setCreatededBy(String creatededBy) {
		this.creatededBy = creatededBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
}
