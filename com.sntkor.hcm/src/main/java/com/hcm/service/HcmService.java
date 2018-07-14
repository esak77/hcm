package com.hcm.service;

import java.util.List;

import com.hcm.domain.DateVO;
import com.hcm.domain.FileDownLoadVO;
import com.hcm.domain.PersonalDataVO;
import com.hcm.domain.ProjectCareerVO;
import com.hcm.domain.ViewVO;

public interface HcmService {
	public int maxIdx() throws Exception; // 총인원 구하기
	public List<DateVO> p_status() throws Exception; // 총인원 중 휴식인원 구하기
	public int statuscode_400() throws Exception; // 비활성화 인원
	
	//입력
	public void t_hcm_personaldata(PersonalDataVO vo) throws Exception;
	public void t_hcm_projectcareer(ProjectCareerVO vo) throws Exception;
	public void t_hcm_fileupload(String file_name) throws Exception;
	
	//수정
	public void update_pd(PersonalDataVO vo) throws Exception;
	public void update_pc(ProjectCareerVO vo) throws Exception;
	
	//삭제
	public void del_pc(int idx) throws Exception;
	
	public PersonalDataVO detail_pd_vo(int idx) throws Exception;
	public List<ProjectCareerVO> detail_pc_vo(int idx) throws Exception;
	public List<FileDownLoadVO> detail_files_vo(int idx) throws Exception;
	
	public List<ViewVO> view() throws Exception;
}
