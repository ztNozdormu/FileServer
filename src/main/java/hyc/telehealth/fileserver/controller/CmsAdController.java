package hyc.telehealth.fileserver.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hyc.telehealth.fileserver.model.CmsAd;
import hyc.telehealth.fileserver.service.impl.CmsAdService;

@Controller
@RequestMapping("cmscontroller")
public class CmsAdController {
	
	 @Autowired
	 public CmsAdService cmsAdService;
	 
	 @RequestMapping("/getCmsInfo")
	 @ResponseBody
	 public Object	getCmsAd(HttpServletRequest request) {
		List<CmsAd> ca =  cmsAdService.getCmsAdInfos();
		 
		 return ca;
	 }
	
  
}
