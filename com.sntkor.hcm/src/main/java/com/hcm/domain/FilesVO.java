package com.hcm.domain;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class FilesVO {
	private List<MultipartFile> file_name;
	
	public FilesVO() {
		super();
	}

	public FilesVO(List<MultipartFile> file_name) {
		super();
		this.file_name = file_name;
	}

	public List<MultipartFile> getFile_name() {
		return file_name;
	}

	public void setFile_name(List<MultipartFile> file_name) {
		this.file_name = file_name;
	}

	@Override
	public String toString() {
		return "FilesVO [file_name=" + file_name + "]";
	}

	
}
