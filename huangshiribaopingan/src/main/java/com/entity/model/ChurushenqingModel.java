package com.entity.model;

import com.entity.ChurushenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 出入申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChurushenqingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 出入情况
     */
    private String churushenqingQinkuang;


    /**
     * 出入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date churushenqingTime;


    /**
     * 出入类型
     */
    private Integer churushenqingTypes;


    /**
     * 出入去向
     */
    private String churushenqingAddress;


    /**
     * 体温
     */
    private Double churushenqingTiwen;


    /**
     * 申请状态
     */
    private Integer churushenqingYesnoTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：出入情况
	 */
    public String getChurushenqingQinkuang() {
        return churushenqingQinkuang;
    }


    /**
	 * 设置：出入情况
	 */
    public void setChurushenqingQinkuang(String churushenqingQinkuang) {
        this.churushenqingQinkuang = churushenqingQinkuang;
    }
    /**
	 * 获取：出入时间
	 */
    public Date getChurushenqingTime() {
        return churushenqingTime;
    }


    /**
	 * 设置：出入时间
	 */
    public void setChurushenqingTime(Date churushenqingTime) {
        this.churushenqingTime = churushenqingTime;
    }
    /**
	 * 获取：出入类型
	 */
    public Integer getChurushenqingTypes() {
        return churushenqingTypes;
    }


    /**
	 * 设置：出入类型
	 */
    public void setChurushenqingTypes(Integer churushenqingTypes) {
        this.churushenqingTypes = churushenqingTypes;
    }
    /**
	 * 获取：出入去向
	 */
    public String getChurushenqingAddress() {
        return churushenqingAddress;
    }


    /**
	 * 设置：出入去向
	 */
    public void setChurushenqingAddress(String churushenqingAddress) {
        this.churushenqingAddress = churushenqingAddress;
    }
    /**
	 * 获取：体温
	 */
    public Double getChurushenqingTiwen() {
        return churushenqingTiwen;
    }


    /**
	 * 设置：体温
	 */
    public void setChurushenqingTiwen(Double churushenqingTiwen) {
        this.churushenqingTiwen = churushenqingTiwen;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getChurushenqingYesnoTypes() {
        return churushenqingYesnoTypes;
    }


    /**
	 * 设置：申请状态
	 */
    public void setChurushenqingYesnoTypes(Integer churushenqingYesnoTypes) {
        this.churushenqingYesnoTypes = churushenqingYesnoTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
