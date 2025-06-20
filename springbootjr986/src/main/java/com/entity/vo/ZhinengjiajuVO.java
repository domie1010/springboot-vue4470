package com.entity.vo;

import com.entity.ZhinengjiajuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 智能家居
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-05-23 10:17:53
 */
public class ZhinengjiajuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 标题
	 */
	
	private String biaoti;
		
	/**
	 * 商品链接
	 */
	
	private String shangpinlianjie;
		
	/**
	 * 商品价格
	 */
	
	private Integer shangpinjiage;
		
	/**
	 * 商品图片
	 */
	
	private String shangpintupian;
		
	/**
	 * 商品类型
	 */
	
	private String shangpinleixing;
		
	/**
	 * 商品品牌
	 */
	
	private String shangpinpinpai;
		
	/**
	 * 好评数
	 */
	
	private Integer haopingshu;
		
	/**
	 * 差评数
	 */
	
	private Integer chapingshu;
		
	/**
	 * 评论总数
	 */
	
	private Integer pinglunzongshu;
				
	
	/**
	 * 设置：标题
	 */
	 
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
				
	
	/**
	 * 设置：商品链接
	 */
	 
	public void setShangpinlianjie(String shangpinlianjie) {
		this.shangpinlianjie = shangpinlianjie;
	}
	
	/**
	 * 获取：商品链接
	 */
	public String getShangpinlianjie() {
		return shangpinlianjie;
	}
				
	
	/**
	 * 设置：商品价格
	 */
	 
	public void setShangpinjiage(Integer shangpinjiage) {
		this.shangpinjiage = shangpinjiage;
	}
	
	/**
	 * 获取：商品价格
	 */
	public Integer getShangpinjiage() {
		return shangpinjiage;
	}
				
	
	/**
	 * 设置：商品图片
	 */
	 
	public void setShangpintupian(String shangpintupian) {
		this.shangpintupian = shangpintupian;
	}
	
	/**
	 * 获取：商品图片
	 */
	public String getShangpintupian() {
		return shangpintupian;
	}
				
	
	/**
	 * 设置：商品类型
	 */
	 
	public void setShangpinleixing(String shangpinleixing) {
		this.shangpinleixing = shangpinleixing;
	}
	
	/**
	 * 获取：商品类型
	 */
	public String getShangpinleixing() {
		return shangpinleixing;
	}
				
	
	/**
	 * 设置：商品品牌
	 */
	 
	public void setShangpinpinpai(String shangpinpinpai) {
		this.shangpinpinpai = shangpinpinpai;
	}
	
	/**
	 * 获取：商品品牌
	 */
	public String getShangpinpinpai() {
		return shangpinpinpai;
	}
				
	
	/**
	 * 设置：好评数
	 */
	 
	public void setHaopingshu(Integer haopingshu) {
		this.haopingshu = haopingshu;
	}
	
	/**
	 * 获取：好评数
	 */
	public Integer getHaopingshu() {
		return haopingshu;
	}
				
	
	/**
	 * 设置：差评数
	 */
	 
	public void setChapingshu(Integer chapingshu) {
		this.chapingshu = chapingshu;
	}
	
	/**
	 * 获取：差评数
	 */
	public Integer getChapingshu() {
		return chapingshu;
	}
				
	
	/**
	 * 设置：评论总数
	 */
	 
	public void setPinglunzongshu(Integer pinglunzongshu) {
		this.pinglunzongshu = pinglunzongshu;
	}
	
	/**
	 * 获取：评论总数
	 */
	public Integer getPinglunzongshu() {
		return pinglunzongshu;
	}
			
}
