package hyc.telehealth.fileserver.model;

import java.util.Date;
import javax.persistence.*;

import org.springframework.stereotype.Component;

@Table(name = "cms_ad")
@Component
public class CmsAd {

	@Id
    private String id;

    /**
     * createName
     */
    @Column(name = "create_name")
    private String createName;

    /**
     * createBy
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * createDate
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * ����
     */
    private String title;

    /**
     * ͼƬ��ַ
     */
    @Column(name = "image_href")
    private String imageHref;

    /**
     * ͼƬ����
     */
    @Column(name = "image_name")
    private String imageName;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * ��ȡcreateName
     *
     * @return create_name - createName
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * ����createName
     *
     * @param createName createName
     */
    public void setCreateName(String createName) {
        this.createName = createName;
    }

    /**
     * ��ȡcreateBy
     *
     * @return create_by - createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * ����createBy
     *
     * @param createBy createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * ��ȡcreateDate
     *
     * @return create_date - createDate
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * ����createDate
     *
     * @param createDate createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * ��ȡ����
     *
     * @return title - ����
     */
    public String getTitle() {
        return title;
    }

    /**
     * ���ñ���
     *
     * @param title ����
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * ��ȡͼƬ��ַ
     *
     * @return image_href - ͼƬ��ַ
     */
    public String getImageHref() {
        return imageHref;
    }

    /**
     * ����ͼƬ��ַ
     *
     * @param imageHref ͼƬ��ַ
     */
    public void setImageHref(String imageHref) {
        this.imageHref = imageHref;
    }

    /**
     * ��ȡͼƬ����
     *
     * @return image_name - ͼƬ����
     */
    public String getImageName() {
        return imageName;
    }

    /**
     * ����ͼƬ����
     *
     * @param imageName ͼƬ����
     */
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}