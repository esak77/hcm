package com.hcm.service;

import java.util.List;

import com.hcm.domain.PersonalDataVO;
import com.hcm.domain.ProjectCareerVO;
import com.hcm.domain.ViewVO;

public interface HcmService {
	public void t_hcm_personaldata(PersonalDataVO vo) throws Exception;
	public void t_hcm_projectcareer(ProjectCareerVO vo) throws Exception;
	public void t_hcm_fileupload(String file_name) throws Exception;
	public int maxIdx() throws Exception;
	public List<PersonalDataVO> personaldata_list() throws Exception;
	public List<ViewVO> view() throws Exception;
}
