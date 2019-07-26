package com.ldh.bk.model;

import java.util.Date;

/**
 * 影集
 * @author Li Dehuan
 * @date 2019年7月24日
 *
 */
public class Album {

	private Long id;			// 主键
	
	private String title;		// 标题
	
	private String content;		// 内容
	
	private Date createDate;	// 创建时间
	
	private Integer valid;		// 有效值
	
	private String imgUrl;		// 图片地址

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getValid() {
		return valid;
	}

	public void setValid(Integer valid) {
		this.valid = valid;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
}
