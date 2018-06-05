package com.hcm.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hcm.domain.PersonalDataVO;
import com.hcm.domain.ProjectCareerVO;
import com.hcm.domain.ViewVO;

@Repository
public class HcmDAOImpl implements HcmDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.sntkor.mappers.HcmMapper";
	
	
	@Override
	public void t_hcm_personaldata(PersonalDataVO vo) throws Exception {
		session.insert(namespace+".t_hcm_personaldata",vo);
	}

	@Override
	public void t_hcm_projectcareer(ProjectCareerVO vo) throws Exception {
		session.insert(namespace+".t_hcm_projectcareer", vo);
	}

	@Override
	public void t_hcm_fileupload(String file_name) throws Exception {
		session.insert(namespace+".t_hcm_fileupload", file_name);
	}

	@Override
	public int maxIdx() throws Exception {
		return session.selectOne(namespace+".maxIdx");
	}

	@Override
	public List<PersonalDataVO> personaldata_list() throws Exception {
		return session.selectList(namespace+".personaldata_list");
	}

	@Override
	public List<ViewVO> view() throws Exception {
		return session.selectList(namespace+".view");
	}


	
	
	
}
