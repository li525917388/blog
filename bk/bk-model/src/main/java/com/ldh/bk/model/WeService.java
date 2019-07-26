package com.ldh.bk.model;


/**
 * 我们的服务
 * @author Li Dehuan
 * @date 2019年7月22日
 *
 */
public class WeService {

	private Integer id;		// 主键
	
	private String title;	// 标题
	
	private String desc;	// 描述
	
	private String icon;	// 图标
	
	private Integer order;	// 排序
	
	private Integer valid;	// 有效值

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public Integer getValid() {
		return valid;
	}

	public void setValid(Integer valid) {
		this.valid = valid;
	}
	
}
