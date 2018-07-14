package com.hcm.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hcm.domain.DateVO;
import com.hcm.domain.FileDownLoadVO;
import com.hcm.domain.PersonalDataVO;
import com.hcm.domain.ProjectCareerVO;
import com.hcm.domain.ViewVO;

@Repository
public class HcmDAOImpl implements HcmDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.sntkor.mappers.HcmMapper";
	
	@Override // 총인원
	public int maxIdx() throws Exception {
		return session.selectOne(namespace+".maxIdx");
	}

	@Override // 프로젝트 투입여부
	public List<DateVO> p_status() throws Exception {
		return session.selectList(namespace+".p_status");
	}

	@Override // 비활성화
	public int statuscode_400() throws Exception {
		return session.selectOne(namespace+".statuscode_400");
	}

	//입력
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

	//수정
	@Override
	public void update_pd(PersonalDataVO vo) throws Exception {
		session.insert(namespace+".update_pd",vo);
	}
	@Override
	public void update_pc(ProjectCareerVO vo) throws Exception {
		session.insert(namespace+".update_pc",vo);
	}

	@Override
	public List<ViewVO> view() throws Exception {
		return session.selectList(namespace+".view");
	}

	//삭제
	@Override
	public void del_pc(int idx) throws Exception {
		session.delete(namespace+".del_pc",idx);
	}
	
	
	
	

	@Override
	public PersonalDataVO detail_pd_vo(int idx) throws Exception {
		return session.selectOne(namespace+".detail_pd_vo",idx);
	}

	

	@Override
	public List<ProjectCareerVO> detail_pc_vo(int idx) throws Exception {
		return session.selectList(namespace+".detail_pc_vo",idx);
	}

	@Override
	public List<FileDownLoadVO> detail_files_vo(int idx) throws Exception {
		return session.selectList(namespace+".detail_files_vo",idx);
	}



	
	
	
	
}
