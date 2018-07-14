package com.hcm.domain;

public class ViewVO {
	private Integer idx;
	private String name;
	private String techinicalrating;
	private String career;
	private String pro_term2; // 프로젝트종료일
	public ViewVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ViewVO(Integer idx, String name, String techinicalrating, String career, String pro_term2) {
		super();
		this.idx = idx;
		this.name = name;
		this.techinicalrating = techinicalrating;
		this.career = career;
		this.pro_term2 = pro_term2;
	}
	public Integer getIdx() {
		return idx;
	}
	public void setIdx(Integer idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTechinicalrating() {
		return techinicalrating;
	}
	public void setTechinicalrating(String techinicalrating) {
		this.techinicalrating = techinicalrating;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public String getPro_term2() {
		return pro_term2;
	}
	public void setPro_term2(String pro_term2) {
		this.pro_term2 = pro_term2;
	}
	@Override
	public String toString() {
		return "ViewVO [idx=" + idx + ", name=" + name + ", techinicalrating=" + techinicalrating + ", career=" + career
				+ ", pro_term2=" + pro_term2 + "]";
	}
	
	
	
	
	
}	
