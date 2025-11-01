package com.jsp.appService.Dto;

import java.io.Serializable;

import com.jsp.appService.Entity.appService;

public class AppResponseDto implements Serializable{
	
	     public AppResponseDto(String status, String statusCode, Object saveObj, String error) {
		super();
		this.status = status;
		this.statusCode = statusCode;
		this.data = saveObj;
		this.error = error;
	}
		String status;
	     String statusCode;
	     Object data;
	     String error;
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getStatusCode() {
			return statusCode;
		}
		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}
		public Object getData() {
			return data;
		}
		public void setData(Object data) {
			this.data = data;
		}
		public String getError() {
			return error;
		}
		public void setError(String error) {
			this.error = error;
		}

}
