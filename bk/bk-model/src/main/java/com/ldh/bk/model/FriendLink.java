package com.ldh.bk.model;

/**
 * 友情链接表 oth_friend_link
 * 
 * @author Li Dehuan
 * @date 2019-07-26
 */
public class FriendLink {
	
	/** 主键 */
	private Long id;
	/** 链接名称 */
	private String linkName;
	/** 标题 */
	private String linkTitle;
	/** 链接地址 */
	private String linkUrl;
	/** 类型 */
	private String linkType;
	/** 备注 */
	private String remark;
	/** 有效值 */
	private Integer valid;
	/** 顺序 */
	private Integer sortNo;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public String getLinkName() {
		return linkName;
	}
	public void setLinkTitle(String linkTitle) {
		this.linkTitle = linkTitle;
	}

	public String getLinkTitle() {
		return linkTitle;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getLinkUrl() {
		return linkUrl;
	}
	public void setLinkType(String linkType) {
		this.linkType = linkType;
	}

	public String getLinkType() {
		return linkType;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}
	public void setValid(Integer valid) {
		this.valid = valid;
	}

	public Integer getValid() {
		return valid;
	}
	public void setSortNo(Integer sortNo) {
		this.sortNo = sortNo;
	}

	public Integer getSortNo() {
		return sortNo;
	}

}
