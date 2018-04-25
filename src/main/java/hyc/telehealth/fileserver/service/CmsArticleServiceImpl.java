package hyc.telehealth.fileserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hyc.telehealth.fileserver.mapper.CmsArticleMapper;
import hyc.telehealth.fileserver.model.CmsArticle;
import hyc.telehealth.fileserver.service.impl.CmsArticleService;

@Service
public class CmsArticleServiceImpl implements CmsArticleService{
	
	@Autowired
	CmsArticleMapper cmsArticleMapper;

	@Override
	public List<CmsArticle> getCmsArticleList() {
		// TODO Auto-generated method stub
		return cmsArticleMapper.selectAll();
	}
}
