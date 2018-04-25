package hyc.telehealth.fileserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hyc.telehealth.fileserver.mapper.CmsAdMapper;
import hyc.telehealth.fileserver.model.CmsAd;
import hyc.telehealth.fileserver.service.impl.CmsAdService;

@Service
public class CmsAdServiceImpl implements CmsAdService{
	
   @Autowired
   public CmsAdMapper cmsadmapper;

		@Override
		public List<CmsAd> getCmsAdInfos() {
			return cmsadmapper.selectAll();
		}

	
		   
   
}
