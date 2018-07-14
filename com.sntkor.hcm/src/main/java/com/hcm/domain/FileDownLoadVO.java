package com.hcm.domain;

public class FileDownLoadVO {
	private String file_name;

	public FileDownLoadVO() {
		super();
	}

	public FileDownLoadVO(String file_name) {
		super();
		this.file_name = file_name;
	}

	public String getfile_name() {
		return file_name;
	}

	public void setfile_name(String file_name) {
		this.file_name = file_name;
	}

	@Override
	public String toString() {
		return "FileDownLoadVO [file_name=" + file_name + "]";
	}
	
}
