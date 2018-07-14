package com.hcm.domain;

public class ProjectCareerVO {
	private Integer idx;
	private String pro_tit;
	private String pro_detail;
	private String pro_term1;
	private String pro_term2;
	private String pro_part;
	private String pro_reference;
	private String pro_technic;
	
	public ProjectCareerVO() {
		super();
	}

	public ProjectCareerVO(Integer idx, String pro_tit, String pro_detail, String pro_term1, String pro_term2,
			String pro_part, String pro_reference, String pro_technic) {
		super();
		this.idx = idx;
		this.pro_tit = pro_tit;
		this.pro_detail = pro_detail;
		this.pro_term1 = pro_term1;
		this.pro_term2 = pro_term2;
		this.pro_part = pro_part;
		this.pro_reference = pro_reference;
		this.pro_technic = pro_technic;
	}
	
	public Integer getIdx() {
		return idx;
	}

	public void setIdx(Integer idx) {
		this.idx = idx;
	}

	public String getPro_tit() {
		return pro_tit;
	}

	public void setPro_tit(String pro_tit) {
		this.pro_tit = pro_tit;
	}

	public String getPro_detail() {
		return pro_detail;
	}

	public void setPro_detail(String pro_detail) {
		this.pro_detail = pro_detail;
	}

	public String getPro_term1() {
		return pro_term1;
	}

	public void setPro_term1(String pro_term1) {
		this.pro_term1 = pro_term1;
	}

	public String getPro_term2() {
		return pro_term2;
	}

	public void setPro_term2(String pro_term2) {
		this.pro_term2 = pro_term2;
	}

	public String getPro_part() {
		return pro_part;
	}

	public void setPro_part(String pro_part) {
		this.pro_part = pro_part;
	}

	public String getPro_reference() {
		return pro_reference;
	}

	public void setPro_reference(String pro_reference) {
		this.pro_reference = pro_reference;
	}

	public String getPro_technic() {
		return pro_technic;
	}

	public void setPro_technic(String pro_technic) {
		this.pro_technic = pro_technic;
	}

	@Override
	public String toString() {
		return "ProjectCareerVO [idx=" + idx + ", pro_tit=" + pro_tit + ", pro_detail=" + pro_detail + ", pro_term1="
				+ pro_term1 + ", pro_term2=" + pro_term2 + ", pro_part=" + pro_part + ", pro_reference=" + pro_reference
				+ ", pro_technic=" + pro_technic + "]";
	}
	
		
}
