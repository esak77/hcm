package com.hcm.controller;


import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.hcm.domain.FilesVO;
import com.hcm.domain.PersonalDataVO;
import com.hcm.domain.ProjectCareerVO;
import com.hcm.service.HcmService;
@Controller
public class HCMController {
	
	@Inject
	private HcmService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) throws Exception{
		
		
		model.addAttribute("maxIdx", service.maxIdx());
		System.out.println(service.view());
		//model.addAttribute("total", map);
		
		return "index";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public void insert(Model model) throws Exception{
	}
	
	@RequestMapping(value = "/insert_db", method = RequestMethod.POST)
	public String insert_db(PersonalDataVO vo, 
			@RequestParam("pro_tit") String[] pro_tit, @RequestParam("pro_detail") String[] pro_detail,
			@RequestParam("pro_term1") String[] pro_term1, @RequestParam("pro_term2") String[] pro_term2,
			@RequestParam("pro_part") String[] pro_part, @RequestParam("pro_reference") String[] pro_reference,
			@RequestParam("pro_technic") String[] pro_technic, FilesVO files) throws Exception{

		//인적사항 insert
		service.t_hcm_personaldata(vo);
		
		//경력사항 insert
		ProjectCareerVO projectcareervo = new ProjectCareerVO();
		for(int i=0;i<pro_tit.length; i++) {
			projectcareervo.setPro_tit(pro_tit[i]);
			projectcareervo.setPro_detail(pro_detail[i]);
			projectcareervo.setPro_term1(pro_term1[i]);
			projectcareervo.setPro_term2(pro_term2[i]);
			projectcareervo.setPro_part(pro_part[i]);
			projectcareervo.setPro_reference(pro_reference[i]);
			projectcareervo.setPro_technic(pro_technic[i]);
			
			//service.t_hcm_projectcareer(projectcareervo);
			
		}
		
		
		//File mkdir = new File("C:\\Users\\SNTKorea\\Desktop\\test\\"+vo.getPhone()); //테스트 경로 (윈도우)
		//String uploadPath = "C:\\Users\\SNTKorea\\Desktop\\test\\"+vo.getPhone()+"\\"; //테스트 경로 (윈도우)
		File mkdir = new File("/home/hcm_files/"+vo.getPhone()); //실제경로
		String uploadPath = "/home/hcm_files/"+vo.getPhone()+"/"; //실제경로
		
		if(!mkdir.exists()) {
			mkdir.mkdirs();
		}
		
		//첨부파일 insert
		List<MultipartFile> list =  files.getFile_name();
		
		InputStream ips = null;
		OutputStream ops = null;
		for(int i=list.size()-1; i>=0; i--) {
			
			MultipartFile file = list.get(i);
			
			if(file.getSize()==0) {
				list.remove(i);
				continue;
			}
			
			String fileName = file.getOriginalFilename();
			
			try {
				ips = file.getInputStream();
				
				File newFile = new File(uploadPath+fileName);
				if(!newFile.exists()) {
					newFile.createNewFile();
				}
				ops = new FileOutputStream(newFile);
				int read = 0;
				byte[] bytes = new byte[1024];
				while((read=ips.read(bytes)) != -1 ) {
					ops.write(bytes, 0, read);
				}
				service.t_hcm_fileupload(fileName);
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(ips!=null) ips.close();
					if(ops!=null) ops.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
			
			
		}
		
		return "redirect:/insert";
	}
	
}
