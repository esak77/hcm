package com.hcm.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hcm.domain.DateVO;
import com.hcm.domain.FileDownLoadVO;
import com.hcm.domain.PersonalDataVO;
import com.hcm.domain.ProjectCareerVO;
import com.hcm.domain.ViewVO;
import com.hcm.persistence.HcmDAO;

@Service
public class HcmServiceImpl implements HcmService {

	@Inject
	private HcmDAO dao;
	
	@Override //총인원
	public int maxIdx() throws Exception {
		return dao.maxIdx();
	}
	
	@Override //프로젝트투입여부
	public List<DateVO> p_status() throws Exception {
		return dao.p_status();
	}

	@Override //비활성화
	public int statuscode_400() throws Exception {
		return dao.statuscode_400();
	}

	//입력
	@Override
	public void t_hcm_personaldata(PersonalDataVO vo) throws Exception {
		dao.t_hcm_personaldata(vo);
	}

	@Override
	public void t_hcm_projectcareer(ProjectCareerVO vo) throws Exception {
		dao.t_hcm_projectcareer(vo);
	}

	@Override
	public void t_hcm_fileupload(String file_name) throws Exception {
		dao.t_hcm_fileupload(file_name);
	}

	//수정
	@Override
	public void update_pd(PersonalDataVO vo) throws Exception {
		dao.update_pd(vo);
	}
	@Override
	public void update_pc(ProjectCareerVO vo) throws Exception {
		dao.update_pc(vo);
		
	}

	//삭제
	@Override
	public void del_pc(int idx) throws Exception {
		dao.del_pc(idx);
	}
	
	
	
	
	@Override
	public List<ViewVO> view() throws Exception {
		return dao.view();
	}

	@Override
	public PersonalDataVO detail_pd_vo(int idx) throws Exception {
		return dao.detail_pd_vo(idx);
	}

	@Override
	public List<ProjectCareerVO> detail_pc_vo(int idx) throws Exception {
		return dao.detail_pc_vo(idx);
	}

	@Override
	public List<FileDownLoadVO> detail_files_vo(int idx) throws Exception {
		return dao.detail_files_vo(idx);
	}

	
	

}
