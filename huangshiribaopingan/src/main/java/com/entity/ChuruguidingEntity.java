package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 出入规定
 *
 * @author 
 * @email
 */
@TableName("churuguiding")
public class ChuruguidingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChuruguidingEntity() {

	}

	public ChuruguidingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 内容
     */
    @TableField(value = "churuguiding_content")

    private String churuguidingContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Churuguiding{" +
            "id=" + id +
            ", churuguidingName=" + churuguidingName +
            ", churuguidingPhoto=" + churuguidingPhoto +
            ", insertTime=" + insertTime +
            ", churuguidingContent=" + churuguidingContent +
            ", createTime=" + createTime +
        "}";
    }
}
