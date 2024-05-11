package com.entity.vo;

import com.entity.ChurushenqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 出入申请
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("churushenqing")
public class ChurushenqingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
