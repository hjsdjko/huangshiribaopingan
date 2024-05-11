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
 * 出入申请
 *
 * @author 
 * @email
 */
@TableName("churushenqing")
public class ChurushenqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChurushenqingEntity() {

	}

	public ChurushenqingEntity(T t) {
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

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 出入情况
     */
    @TableField(value = "churushenqing_qinkuang")

    private String churushenqingQinkuang;


    /**
     * 出入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "churushenqing_time")

    private Date churushenqingTime;


    /**
     * 出入类型
     */
    @TableField(value = "churushenqing_types")

    private Integer churushenqingTypes;


    /**
     * 出入去向
     */
    @TableField(value = "churushenqing_address")

    private String churushenqingAddress;


    /**
     * 体温
     */
    @TableField(value = "churushenqing_tiwen")

    private Double churushenqingTiwen;


    /**
     * 申请状态
     */
    @TableField(value = "churushenqing_yesno_types")

    private Integer churushenqingYesnoTypes;


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
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：出入情况
	 */
    public String getChurushenqingQinkuang() {
        return churushenqingQinkuang;
    }


    /**
	 * 获取：出入情况
	 */

    public void setChurushenqingQinkuang(String churushenqingQinkuang) {
        this.churushenqingQinkuang = churushenqingQinkuang;
    }
    /**
	 * 设置：出入时间
	 */
    public Date getChurushenqingTime() {
        return churushenqingTime;
    }


    /**
	 * 获取：出入时间
	 */

    public void setChurushenqingTime(Date churushenqingTime) {
        this.churushenqingTime = churushenqingTime;
    }
    /**
	 * 设置：出入类型
	 */
    public Integer getChurushenqingTypes() {
        return churushenqingTypes;
    }


    /**
	 * 获取：出入类型
	 */

    public void setChurushenqingTypes(Integer churushenqingTypes) {
        this.churushenqingTypes = churushenqingTypes;
    }
    /**
	 * 设置：出入去向
	 */
    public String getChurushenqingAddress() {
        return churushenqingAddress;
    }


    /**
	 * 获取：出入去向
	 */

    public void setChurushenqingAddress(String churushenqingAddress) {
        this.churushenqingAddress = churushenqingAddress;
    }
    /**
	 * 设置：体温
	 */
    public Double getChurushenqingTiwen() {
        return churushenqingTiwen;
    }


    /**
	 * 获取：体温
	 */

    public void setChurushenqingTiwen(Double churushenqingTiwen) {
        this.churushenqingTiwen = churushenqingTiwen;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getChurushenqingYesnoTypes() {
        return churushenqingYesnoTypes;
    }


    /**
	 * 获取：申请状态
	 */

    public void setChurushenqingYesnoTypes(Integer churushenqingYesnoTypes) {
        this.churushenqingYesnoTypes = churushenqingYesnoTypes;
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
        return "Churushenqing{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", churushenqingQinkuang=" + churushenqingQinkuang +
            ", churushenqingTime=" + churushenqingTime +
            ", churushenqingTypes=" + churushenqingTypes +
            ", churushenqingAddress=" + churushenqingAddress +
            ", churushenqingTiwen=" + churushenqingTiwen +
            ", churushenqingYesnoTypes=" + churushenqingYesnoTypes +
            ", createTime=" + createTime +
        "}";
    }
}
