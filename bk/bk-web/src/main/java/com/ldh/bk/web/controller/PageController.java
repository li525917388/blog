package com.ldh.bk.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.ldh.bk.model.Album;
import com.ldh.bk.model.Config;
import com.ldh.bk.model.FriendLink;
import com.ldh.bk.model.WeService;
import com.ldh.bk.service.AlbumService;
import com.ldh.bk.service.ConfigService;
import com.ldh.bk.service.FriendLinkService;
import com.ldh.bk.service.WeServService;

@Controller
public class PageController {
	
	
	@Resource
	AlbumService albumService;
	
	@Resource
	WeServService weServService;
	
	@Resource
	ConfigService configService;
	
	@Resource
	FriendLinkService friendLinkService;

	
	/**
	 * 
	 * @param mmap
	 * @return
	 */
	@GetMapping("/test")
	public String test(ModelMap mmap) {
		
		System.out.println("index");
		mmap.put("myName", "李德欢");		
		
		return "test";
	}
	
	
	/**
	 * 默认主页
	 * @param mmap
	 * @return
	 */
	@GetMapping("/")
	public String defaultIndex(ModelMap mmap) {
		
		return index(mmap);
	}
	
	
	/**
	 * 
	 * @param mmap
	 * @return
	 */
	@GetMapping("/index")
	public String index(ModelMap mmap) {
		
		System.out.println("index");
		
		// 影集列表
		List<Album> albumList = albumService.queryAlbum();
		mmap.put("albumList", albumList);
		
		// 服务列表
		List<WeService> weServiceList = weServService.queryWeServiceList();
		mmap.put("weServiceList", weServiceList);
		
		// 参数列表
		List<Config> configList = configService.queryConfig();
		for(Config conf : configList){
			
			mmap.put(conf.getConfigKey(), conf.getConfigValue());
			
		}
		
		//友情链接列表
		List<FriendLink> friendLinkList = friendLinkService.queryFriendLinks();
		mmap.put("friendLinkList", friendLinkList);
		
		return "index";
	}
		
	
	/**
	 * 
	 * @param mmap
	 * @return
	 */
	@GetMapping("/about")
	public String aboult(ModelMap mmap) {
		
		System.out.println("about");
		
		return "about";
	}
	
	
	
	/**
	 * 
	 * @param mmap
	 * @return
	 */
	@GetMapping("/contact")
	public String contact(ModelMap mmap) {
		
		System.out.println("contact");
		
		return "contact";
	}
	
	
	
	/**
	 * 影集
	 * @param mmap
	 * @return
	 */
	@GetMapping("/album")
	public String album(ModelMap mmap) {
		
		System.out.println("album");

		// 服务列表
		List<WeService> weServiceList = weServService.queryWeServiceList();
		mmap.put("weServiceList", weServiceList);
		
		// 影集列表
		List<Album> albumList = albumService.queryAlbum();
		mmap.put("albumList", albumList);
		
		// 参数列表
		List<Config> configList = configService.queryConfig();
		for(Config conf : configList){
			
			mmap.put(conf.getConfigKey(), conf.getConfigValue());
			
		}
		
		//友情链接列表
		List<FriendLink> friendLinkList = friendLinkService.queryFriendLinks();
		mmap.put("friendLinkList", friendLinkList);
		
		return "album";
	}
	
	
	
	@GetMapping("/portfolio")
	public String portfolio(ModelMap mmap) {
		
		System.out.println("portfolio");
		
		return "portfolio";
	}
	
	
	
	@GetMapping("/services")
	public String services(ModelMap mmap) {
		
		System.out.println("services");
		
		return "services";
	}
}
