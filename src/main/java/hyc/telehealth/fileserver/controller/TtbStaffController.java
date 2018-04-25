package hyc.telehealth.fileserver.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hyc.telehealth.fileserver.model.CmsArticle;
import hyc.telehealth.fileserver.service.impl.CmsArticleService;

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
	
	 @RequestMapping("/getCmsArticleInfo")
	 @ResponseBody
	public List<CmsArticle> getCmsArticleInfo(HttpServletRequest request){
		 
		 List<CmsArticle> cmsArticles = cmsArticleService.getCmsArticleList();
		 
		 return cmsArticles;
		
	}
  
}
