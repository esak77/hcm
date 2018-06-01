package com.hcm.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hcm.domain.PersonalDataVO;
import com.hcm.domain.ProjectCareerVO;
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
	
	

}
