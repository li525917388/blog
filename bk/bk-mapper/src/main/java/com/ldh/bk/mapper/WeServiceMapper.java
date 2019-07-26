package com.ldh.bk.mapper;

import java.util.List;

import com.ldh.bk.model.WeService;

/**
 * 我的服务mapper
 * @author Li Dehuan
 * @date 2019年7月22日
 *
 */
public interface WeServiceMapper {

	
	/**
	 * 查询我们的服务列表
	 * @return
	 */
	List<WeService> queryWeServiceList();
}
