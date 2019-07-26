package com.ldh.bk.mapper;

import java.util.List;

import com.ldh.bk.model.Album;

/**
 * 影集 mapper
 * @author Li Dehuan
 * @date 2019年7月24日
 *
 */
public interface AlbumMapper {

	
	/**
	 * 查询影集列表
	 * @return
	 */
	List<Album> queryAlbum();
}
