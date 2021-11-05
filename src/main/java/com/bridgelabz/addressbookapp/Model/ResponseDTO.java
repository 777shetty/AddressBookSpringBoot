package com.bridgelabz.addressbookapp.Model;

public class ResponseDTO {
	private String message;
	private Object data;

	public ResponseDTO(String message,Object data) {
		this.message = message;
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMesage(String message) {

		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}