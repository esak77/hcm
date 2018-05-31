package com.hcm.domain;

import java.util.ArrayList;

public class ProjectCareerVO {
	private ArrayList<String> pro_tit;
	private ArrayList<String> pro_detail;
	private ArrayList<String> pro_term1;
	private ArrayList<String> pro_term2;
	private ArrayList<String> pro_part;
	private ArrayList<String> pro_reference;
	private ArrayList<String> pro_technic;
	
	public ProjectCareerVO() {
		super();
	}

	public ProjectCareerVO(ArrayList<String> pro_tit, ArrayList<String> pro_detail, ArrayList<String> pro_term1,
			ArrayList<String> pro_term2, ArrayList<String> pro_part, ArrayList<String> pro_reference,
			ArrayList<String> pro_technic) {
		super();
		this.pro_tit = pro_tit;
		this.pro_detail = pro_detail;
		this.pro_term1 = pro_term1;
		this.pro_term2 = pro_term2;
		this.pro_part = pro_part;
		this.pro_reference = pro_reference;
		this.pro_technic = pro_technic;
	}

	public ArrayList<String> getPro_tit() {
		return pro_tit;
	}

	public void setPro_tit(ArrayList<String> pro_tit) {
		this.pro_tit = pro_tit;
	}

	public ArrayList<String> getPro_detail() {
		return pro_detail;
	}

	public void setPro_detail(ArrayList<String> pro_detail) {
		this.pro_detail = pro_detail;
	}

	public ArrayList<String> getPro_term1() {
		return pro_term1;
	}

	public void setPro_term1(ArrayList<String> pro_term1) {
		this.pro_term1 = pro_term1;
	}

	public ArrayList<String> getPro_term2() {
		return pro_term2;
	}

	public void setPro_term2(ArrayList<String> pro_term2) {
		this.pro_term2 = pro_term2;
	}

	public ArrayList<String> getPro_part() {
		return pro_part;
	}

	public void setPro_part(ArrayList<String> pro_part) {
		this.pro_part = pro_part;
	}

	public ArrayList<String> getPro_reference() {
		return pro_reference;
	}

	public void setPro_reference(ArrayList<String> pro_reference) {
		this.pro_reference = pro_reference;
	}

	public ArrayList<String> getPro_technic() {
		return pro_technic;
	}

	public void setPro_technic(ArrayList<String> pro_technic) {
		this.pro_technic = pro_technic;
	}

	@Override
	public String toString() {
		return "ProjectCareerVO [pro_tit=" + pro_tit + ", pro_detail=" + pro_detail + ", pro_term1=" + pro_term1
				+ ", pro_term2=" + pro_term2 + ", pro_part=" + pro_part + ", pro_reference=" + pro_reference
				+ ", pro_technic=" + pro_technic + "]";
	}
	
	
}
