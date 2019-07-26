package com.ldh.bk.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.bk.comm.model.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ldh.bk.model.WeService;
import com.ldh.bk.service.WeServService;

/**
 * 我们的服务
 * @author Li Dehuan
 * @date 2019年7月22日
 *
 */
@Controller
@RequestMapping("/weService")
public class WeServiceController {

	@Resource
	WeServService weServService;
	
	@PostMapping("/list")
	@ResponseBody
	public Result<WeService> list(){
		
		List<WeService> list = weServService.queryWeServiceList();
		
		Result<WeService> res = new Result<>();
		res.setCode(200);
		res.setRows(list);
		
		return res;
	}
}
