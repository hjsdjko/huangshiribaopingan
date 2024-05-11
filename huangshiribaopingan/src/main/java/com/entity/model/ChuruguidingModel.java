package com.entity.model;

import com.entity.ChuruguidingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 出入规定
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChuruguidingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Long id;


    /**
     * 标题
     */
    private String churuguidingName;


    /**
     * 图片
     */
    private String churuguidingPhoto;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 内容
     */
    private String churuguidingContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Long getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Long id) {
        this.id = id;
    }
    /**
	 * 获取：标题
	 */
    public String getChuruguidingName() {
        return churuguidingName;
    }


    /**
	 * 设置：标题
	 */
    public void setChuruguidingName(String churuguidingName) {
        this.churuguidingName = churuguidingName;
    }
    /**
	 * 获取：图片
	 */
    public String getChuruguidingPhoto() {
        return churuguidingPhoto;
    }


    /**
	 * 设置：图片
	 */
    public void setChuruguidingPhoto(String churuguidingPhoto) {
        this.churuguidingPhoto = churuguidingPhoto;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：内容
	 */
    public String getChuruguidingContent() {
        return churuguidingContent;
    }


    /**
	 * 设置：内容
	 */
    public void setChuruguidingContent(String churuguidingContent) {
        this.churuguidingContent = churuguidingContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
