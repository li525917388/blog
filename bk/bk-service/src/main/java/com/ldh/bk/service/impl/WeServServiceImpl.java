package com.ldh.bk.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ldh.bk.mapper.WeServiceMapper;
import com.ldh.bk.model.WeService;
import com.ldh.bk.service.WeServService;

/**
 * 我的服务 sercvice 实现类
 * @author Li Dehuan
 * @date 2019年7月22日
 *
 */
@Service
public class WeServServiceImpl implements WeServService {

	@Resource
	WeServiceMapper weServiceMapper;
	
	/*
	 * 查询我们的服务列表
	 * @see com.ldh.bk.service.WeServService#queryWeServiceList()
	 * 2019年7月22日
	 */
	@Override
	public List<WeService> queryWeServiceList() {
		
		return weServiceMapper.queryWeServiceList();
	}

}
