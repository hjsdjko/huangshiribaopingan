package com.entity.view;

import com.entity.ChurushenqingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 出入申请
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("churushenqing")
public class ChurushenqingView extends ChurushenqingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 出入类型的值
		*/
		private String churushenqingValue;
		/**
		* 申请状态的值
		*/
		private String churushenqingYesnoValue;



		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public ChurushenqingView() {

	}

	public ChurushenqingView(ChurushenqingEntity churushenqingEntity) {
		try {
			BeanUtils.copyProperties(this, churushenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 出入类型的值
			*/
			public String getChurushenqingValue() {
				return churushenqingValue;
			}
			/**
			* 设置： 出入类型的值
			*/
			public void setChurushenqingValue(String churushenqingValue) {
				this.churushenqingValue = churushenqingValue;
			}
			/**
			* 获取： 申请状态的值
			*/
			public String getChurushenqingYesnoValue() {
				return churushenqingYesnoValue;
			}
			/**
			* 设置： 申请状态的值
			*/
			public void setChurushenqingYesnoValue(String churushenqingYesnoValue) {
				this.churushenqingYesnoValue = churushenqingYesnoValue;
			}
















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}


}
