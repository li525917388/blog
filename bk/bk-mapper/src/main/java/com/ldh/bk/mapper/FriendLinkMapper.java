package com.ldh.bk.mapper;

import java.util.List;

import com.ldh.bk.model.FriendLink;

/**
 * 友情链接 mapper
 * @author Li Dehuan
 * @date 2019年7月26日
 *
 */
public interface FriendLinkMapper {

	
	/**
	 * 查询友情链接列表
	 * @return
	 */
	List<FriendLink> queryFriendLinks();
}
