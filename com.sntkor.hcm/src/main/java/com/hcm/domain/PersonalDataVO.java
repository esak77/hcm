package com.hcm.domain;

public class PersonalDataVO {
    private Integer idx;
    private String name;
    private String age;
    private String sex;
    private String education;
    private String company;
    private String position;
    private String techinicalrating;
    private String career;
    private String phone;
    private String mail;
    private String certificate;
    private String postcode;
    private String addr1;
    private String addr2;
    
	public PersonalDataVO() {
		super();
	}
	public PersonalDataVO(Integer idx, String name, String age, String sex, String education, String company,
			String position, String techinicalrating, String career, String phone, String mail, String certificate,
			String postcode, String addr1, String addr2) {
		super();
		this.idx = idx;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.education = education;
		this.company = company;
		this.position = position;
		this.techinicalrating = techinicalrating;
		this.career = career;
		this.phone = phone;
		this.mail = mail;
		this.certificate = certificate;
		this.postcode = postcode;
		this.addr1 = addr1;
		this.addr2 = addr2;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	@Override
	public String toString() {
		return "PersonalDataVO [idx=" + idx + ", name=" + name + ", age=" + age + ", sex=" + sex + ", education="
				+ education + ", company=" + company + ", position=" + position + ", techinicalrating="
				+ techinicalrating + ", career=" + career + ", phone=" + phone + ", mail=" + mail + ", certificate="
				+ certificate + ", postcode=" + postcode + ", addr1=" + addr1 + ", addr2=" + addr2 + "]";
	}
	
	
    
    
}
