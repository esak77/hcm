package com.hcm.service;

import com.hcm.domain.PersonalDataVO;
import com.hcm.domain.ProjectCareerVO;

public interface HcmService {
	public void t_hcm_personaldata(PersonalDataVO vo) throws Exception;
	public void t_hcm_projectcareer(ProjectCareerVO vo) throws Exception;
	public void t_hcm_fileupload(String file_name) throws Exception;
}
