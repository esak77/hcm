package com.hcm.domain;

public class DateVO {
	private String date;

	public DateVO() {
		super();
	}

	public DateVO(String date) {
		super();
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "DateVO [date=" + date + "]";
	}
	
}
