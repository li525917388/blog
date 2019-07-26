package com.ldh.bk.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ldh.bk.mapper.ConfigMapper;
import com.ldh.bk.model.Config;
import com.ldh.bk.service.ConfigService;

/**
 * 参数 service 实现类
 * @author Li Dehuan
 * @date 2019年7月24日
 *
 */
@Service
public class ConfigServiceImpl implements ConfigService {

	@Resource
	ConfigMapper configMapper;
	
	/*
	 * 根据键名获取参数
	 * @see com.ldh.bk.service.ConfigService#queryConfigByKey(java.lang.String)
	 * 2019年7月24日
	 */
	@Override
	public Config queryConfigByKey(String key) {
		// TODO Auto-generated method stub
		return configMapper.queryConfigByKey(key);
	}

	
	/*
	 * 获取所有参数列表
	 * @see com.ldh.bk.service.ConfigService#queryConfig()
	 * 2019年7月24日
	 */
	@Override
	public List<Config> queryConfig() {
		// TODO Auto-generated method stub
		return configMapper.queryConfig();
	}

}
