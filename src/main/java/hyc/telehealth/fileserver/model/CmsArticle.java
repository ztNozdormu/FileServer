package hyc.telehealth.fileserver.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "RTM.CMS_ARTICLE")
public class CmsArticle {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "CATEGORY_ID")
    private String categoryId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "LINK")
    private String link;

    @Column(name = "COLOR")
    private String color;

    @Column(name = "IMAGE")
    private String image;

    @Column(name = "KEYWORDS")
    private String keywords;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "WEIGHT")
    private Long weight;

    @Column(name = "WEIGHT_DATE")
    private Date weightDate;

    @Column(name = "HITS")
    private Long hits;

    @Column(name = "POSID")
    private String posid;

    @Column(name = "CUSTOM_CONTENT_VIEW")
    private String customContentView;

    @Column(name = "CREATE_BY")
    private String createBy;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    @Column(name = "UPDATE_BY")
    private String updateBy;

    @Column(name = "UPDATE_DATE")
    private Date updateDate;

    @Column(name = "REMARKS")
    private String remarks;

    @Column(name = "DEL_FLAG")
    private String delFlag;

    @Column(name = "SIDE_FLAG")
    private String sideFlag;

    @Column(name = "SIDE_IMAGE")
    private String sideImage;

    @Column(name = "VIEW_CONFIG")
    private String viewConfig;

    /**
     * @return ID
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
     * @return CATEGORY_ID
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return TITLE
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return LINK
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return COLOR
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return IMAGE
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return KEYWORDS
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * @param keywords
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * @return DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return WEIGHT
     */
    public Long getWeight() {
        return weight;
    }

    /**
     * @param weight
     */
    public void setWeight(Long weight) {
        this.weight = weight;
    }

    /**
     * @return WEIGHT_DATE
     */
    public Date getWeightDate() {
        return weightDate;
    }

    /**
     * @param weightDate
     */
    public void setWeightDate(Date weightDate) {
        this.weightDate = weightDate;
    }

    /**
     * @return HITS
     */
    public Long getHits() {
        return hits;
    }

    /**
     * @param hits
     */
    public void setHits(Long hits) {
        this.hits = hits;
    }

    /**
     * @return POSID
     */
    public String getPosid() {
        return posid;
    }

    /**
     * @param posid
     */
    public void setPosid(String posid) {
        this.posid = posid;
    }

    /**
     * @return CUSTOM_CONTENT_VIEW
     */
    public String getCustomContentView() {
        return customContentView;
    }

    /**
     * @param customContentView
     */
    public void setCustomContentView(String customContentView) {
        this.customContentView = customContentView;
    }

    /**
     * @return CREATE_BY
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * @return CREATE_DATE
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return UPDATE_BY
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * @param updateBy
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * @return UPDATE_DATE
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * @return REMARKS
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return DEL_FLAG
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * @param delFlag
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * @return SIDE_FLAG
     */
    public String getSideFlag() {
        return sideFlag;
    }

    /**
     * @param sideFlag
     */
    public void setSideFlag(String sideFlag) {
        this.sideFlag = sideFlag;
    }

    /**
     * @return SIDE_IMAGE
     */
    public String getSideImage() {
        return sideImage;
    }

    /**
     * @param sideImage
     */
    public void setSideImage(String sideImage) {
        this.sideImage = sideImage;
    }

    /**
     * @return VIEW_CONFIG
     */
    public String getViewConfig() {
        return viewConfig;
    }

    /**
     * @param viewConfig
     */
    public void setViewConfig(String viewConfig) {
        this.viewConfig = viewConfig;
    }
}