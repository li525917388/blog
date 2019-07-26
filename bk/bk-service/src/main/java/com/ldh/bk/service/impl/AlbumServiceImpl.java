package com.ldh.bk.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ldh.bk.mapper.AlbumMapper;
import com.ldh.bk.model.Album;
import com.ldh.bk.service.AlbumService;

/**
 * 影集service实现类
 * @author Li Dehuan
 * @date 2019年7月24日
 *
 */
@Service
public class AlbumServiceImpl implements AlbumService {

	@Resource
	AlbumMapper albumMapper;
	
	
	/*
	 * 查询影集列表
	 * @see com.ldh.bk.service.AlbumService#queryAlbum()
	 * 2019年7月24日
	 */
	@Override
	public List<Album> queryAlbum() {
		return albumMapper.queryAlbum();
	}

}
