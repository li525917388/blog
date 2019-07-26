package com.ldh.bk.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ldh.bk.mapper.FriendLinkMapper;
import com.ldh.bk.model.FriendLink;
import com.ldh.bk.service.FriendLinkService;

/**
 * 友情链接 service 实现类
 * @author Li Dehuan
 * @date 2019年7月26日
 *
 */
@Service
public class FriendLinkServiceImpl implements FriendLinkService {

	@Resource
	FriendLinkMapper friendLinkMapper;
	
	@Override
	public List<FriendLink> queryFriendLinks() {
		return friendLinkMapper.queryFriendLinks();
	}

}
