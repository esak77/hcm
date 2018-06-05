package com.hcm.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hcm.domain.PersonalDataVO;
import com.hcm.domain.ProjectCareerVO;
import com.hcm.domain.ViewVO;
import com.hcm.persistence.HcmDAO;

@Service
public class HcmServiceImpl implements HcmService {

	@Inject
	private HcmDAO dao;
	
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

	@Override
	public int maxIdx() throws Exception {
		return dao.maxIdx();
	}

	@Override
	public List<PersonalDataVO> personaldata_list() throws Exception {
		return dao.personaldata_list();
	}

	@Override
	public List<ViewVO> view() throws Exception {
		return dao.view();
	}

	
	

}
