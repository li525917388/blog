package com.ldh.bk.service;

import java.util.List;

import com.ldh.bk.model.Album;

/**
 * 影集service
 * @author Li Dehuan
 * @date 2019年7月24日
 *
 */
public interface AlbumService {

	
	/**
	 * 查询影集列表
	 * @return
	 */
	List<Album> queryAlbum();
}
