package com.entity.vo;

import com.entity.ChuruguidingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 出入规定
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("churuguiding")
public class ChuruguidingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Long id;


    /**
     * 标题
     */

    @TableField(value = "churuguiding_name")
    private String churuguidingName;


    /**
     * 图片
     */

    @TableField(value = "churuguiding_photo")
    private String churuguidingPhoto;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 内容
     */

    @TableField(value = "churuguiding_content")
    private String churuguidingContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Long getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Long id) {
        this.id = id;
    }
    /**
	 * 设置：标题
	 */
    public String getChuruguidingName() {
        return churuguidingName;
    }


    /**
	 * 获取：标题
	 */

    public void setChuruguidingName(String churuguidingName) {
        this.churuguidingName = churuguidingName;
    }
    /**
	 * 设置：图片
	 */
    public String getChuruguidingPhoto() {
        return churuguidingPhoto;
    }


    /**
	 * 获取：图片
	 */

    public void setChuruguidingPhoto(String churuguidingPhoto) {
        this.churuguidingPhoto = churuguidingPhoto;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：内容
	 */
    public String getChuruguidingContent() {
        return churuguidingContent;
    }


    /**
	 * 获取：内容
	 */

    public void setChuruguidingContent(String churuguidingContent) {
        this.churuguidingContent = churuguidingContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
