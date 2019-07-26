package com.ldh.bk.service;

import java.util.List;

import com.ldh.bk.model.WeService;

/**
 * 我的服务 sercvice
 * @author Li Dehuan
 * @date 2019年7月22日
 *
 */
public interface WeServService {

	
	/**
	 * 查询我们的服务列表
	 * @return
	 */
	List<WeService> queryWeServiceList();
}
