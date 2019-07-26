package com.ldh.bk.service;

import java.util.List;

import com.ldh.bk.model.FriendLink;

/**
 * 友情链接 service
 * @author Li Dehuan
 * @date 2019年7月26日
 *
 */
public interface FriendLinkService {

	
	/**
	 * 查询友情链接列表
	 * @return
	 */
	List<FriendLink> queryFriendLinks();
}
