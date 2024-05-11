package com.entity.model;

import com.entity.JiankangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 健康信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiankangxinxiModel implements Serializable {
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
     * 体温
     */
    private Double jiankangxinxiTiwen;


    /**
     * 是否发烧
     */
    private Integer fashaoTypes;


    /**
     * 是否去过高风险地区
     */
    private Integer gaofengxianTypes;


    /**
     * 旅居史
     */
    private String jiankangxinxiAddress;


    /**
     * 健康码
     */
    private String jiankangxinxiPhoto;


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
	 * 获取：体温
	 */
    public Double getJiankangxinxiTiwen() {
        return jiankangxinxiTiwen;
    }


    /**
	 * 设置：体温
	 */
    public void setJiankangxinxiTiwen(Double jiankangxinxiTiwen) {
        this.jiankangxinxiTiwen = jiankangxinxiTiwen;
    }
    /**
	 * 获取：是否发烧
	 */
    public Integer getFashaoTypes() {
        return fashaoTypes;
    }


    /**
	 * 设置：是否发烧
	 */
    public void setFashaoTypes(Integer fashaoTypes) {
        this.fashaoTypes = fashaoTypes;
    }
    /**
	 * 获取：是否去过高风险地区
	 */
    public Integer getGaofengxianTypes() {
        return gaofengxianTypes;
    }


    /**
	 * 设置：是否去过高风险地区
	 */
    public void setGaofengxianTypes(Integer gaofengxianTypes) {
        this.gaofengxianTypes = gaofengxianTypes;
    }
    /**
	 * 获取：旅居史
	 */
    public String getJiankangxinxiAddress() {
        return jiankangxinxiAddress;
    }


    /**
	 * 设置：旅居史
	 */
    public void setJiankangxinxiAddress(String jiankangxinxiAddress) {
        this.jiankangxinxiAddress = jiankangxinxiAddress;
    }
    /**
	 * 获取：健康码
	 */
    public String getJiankangxinxiPhoto() {
        return jiankangxinxiPhoto;
    }


    /**
	 * 设置：健康码
	 */
    public void setJiankangxinxiPhoto(String jiankangxinxiPhoto) {
        this.jiankangxinxiPhoto = jiankangxinxiPhoto;
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
