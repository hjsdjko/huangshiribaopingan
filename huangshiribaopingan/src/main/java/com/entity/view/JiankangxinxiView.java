package com.entity.view;

import com.entity.JiankangxinxiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 健康信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiankangxinxi")
public class JiankangxinxiView extends JiankangxinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 是否发烧的值
		*/
		private String fashaoValue;
		/**
		* 是否去过高风险地区的值
		*/
		private String gaofengxianValue;



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

	public JiankangxinxiView() {

	}

	public JiankangxinxiView(JiankangxinxiEntity jiankangxinxiEntity) {
		try {
			BeanUtils.copyProperties(this, jiankangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 是否发烧的值
			*/
			public String getFashaoValue() {
				return fashaoValue;
			}
			/**
			* 设置： 是否发烧的值
			*/
			public void setFashaoValue(String fashaoValue) {
				this.fashaoValue = fashaoValue;
			}
			/**
			* 获取： 是否去过高风险地区的值
			*/
			public String getGaofengxianValue() {
				return gaofengxianValue;
			}
			/**
			* 设置： 是否去过高风险地区的值
			*/
			public void setGaofengxianValue(String gaofengxianValue) {
				this.gaofengxianValue = gaofengxianValue;
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
