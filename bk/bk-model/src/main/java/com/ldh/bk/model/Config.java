package com.ldh.bk.model;

/**
 * 参数
 * @author Li Dehuan
 * @date 2019年7月24日
 *
 */
public class Config {

	private Long id;				// 主键
	
	private String configName;		// 参数名称
	
	private String configKey;		// 参数键名
	
	private String configValue;	// 参数值
	
	private String remark;			// 备注

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConfigName() {
		return configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
	}

	public String getConfigKey() {
		return configKey;
	}

	public void setConfigKey(String configKey) {
		this.configKey = configKey;
	}

	public String getConfigValue() {
		return configValue;
	}

	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
