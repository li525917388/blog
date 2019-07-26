package com.ldh.bk.mapper;

import java.util.List;

import com.ldh.bk.model.Config;

/**
 * 参数 mapper
 * @author Li Dehuan
 * @date 2019年7月24日
 *
 */
public interface ConfigMapper {

	
	/**
	 * 根据键名称获取参数
	 * @param key
	 * @return
	 */
	Config queryConfigByKey(String key);
	
	
	/**
	 * 查询所有参数
	 * @return
	 */
	List<Config> queryConfig();
	
}
