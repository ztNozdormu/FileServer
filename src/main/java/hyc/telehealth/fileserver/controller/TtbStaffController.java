package hyc.telehealth.fileserver.controller;

import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.ImageIcon;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hyc.telehealth.fileserver.model.CmsArticle;
import hyc.telehealth.fileserver.model.TTbStaff;
import hyc.telehealth.fileserver.service.impl.CmsArticleService;
import hyc.telehealth.fileserver.service.impl.TbStaffService;
import hyc.telehealth.fileserver.util.HttpUtils;

/**
 * https://www.cnblogs.com/ProgramerWorldOfMe/p/5149238.html
 * @author DELL  文件处理
 *
 */
@Controller
@RequestMapping("fileController")
public class TtbStaffController {
	
   
	@Autowired
	public CmsArticleService cmsArticleService;
	@Autowired
	public TbStaffService tbStaffService;
	
	 @RequestMapping("/getCmsArticleInfo")
	 @ResponseBody
	public List<CmsArticle> getCmsArticleInfo(HttpServletRequest request){
		 
		 List<CmsArticle> cmsArticles = cmsArticleService.getCmsArticleList();
		 
		 return cmsArticles;
		
	}
	 
	 @RequestMapping("/getTtbStaffInfo")
	 @ResponseBody
	 public String getTtbStaffInfo(HttpServletRequest request) throws SQLException, IOException{
		 
		 List<TTbStaff> ttbStaffs = tbStaffService.getTbStaffInfos();

		  for(TTbStaff ttbstaff:ttbStaffs) {
			  if(!StringUtils.isBlank(ttbstaff.getDepCode())) {
//				  depCode+staffCode
			  HttpUtils.isHaveImage(ttbstaff.getStaffCode(),ttbstaff.getStaffCode());
	              }
			  }
		 return "下载完毕";
	  }
     
	 @RequestMapping("/getIcon")  
	    public String book_getBookImg(HttpServletRequest request,HttpServletResponse response,String id) throws Exception{  
	        List<TTbStaff> ttbStaffs = tbStaffService.getTbStaffInfos();
	        byte[] imgbytes= ttbStaffs.get(5).getImage();  
	        OutputStream  out= response.getOutputStream();  
	        out.write(imgbytes);  
	        return null;  
	    }  
	 
	 
  
}
