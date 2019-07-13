package io.chr1s.blog.domain;

import lombok.ToString;

import java.util.Date;

@ToString
public class Article {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.id
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.article_id
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    private String articleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.title
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.category
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    private Byte category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.show
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    private Boolean show;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.del_flag
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    private Boolean delFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.create_time
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.update_time
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.content
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.id
     *
     * @return the value of article.id
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.id
     *
     * @param id the value for article.id
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.article_id
     *
     * @return the value of article.article_id
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    public String getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.article_id
     *
     * @param articleId the value for article.article_id
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.title
     *
     * @return the value of article.title
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.title
     *
     * @param title the value for article.title
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.category
     *
     * @return the value of article.category
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    public Byte getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.category
     *
     * @param category the value for article.category
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    public void setCategory(Byte category) {
        this.category = category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.show
     *
     * @return the value of article.show
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    public Boolean getShow() {
        return show;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.show
     *
     * @param show the value for article.show
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    public void setShow(Boolean show) {
        this.show = show;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.del_flag
     *
     * @return the value of article.del_flag
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    public Boolean getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.del_flag
     *
     * @param delFlag the value for article.del_flag
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.create_time
     *
     * @return the value of article.create_time
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.create_time
     *
     * @param createTime the value for article.create_time
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.update_time
     *
     * @return the value of article.update_time
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.update_time
     *
     * @param updateTime the value for article.update_time
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.content
     *
     * @return the value of article.content
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.content
     *
     * @param content the value for article.content
     *
     * @mbg.generated Sat Jul 13 19:08:11 CST 2019
     */
    public void setContent(String content) {
        this.content = content;
    }
}