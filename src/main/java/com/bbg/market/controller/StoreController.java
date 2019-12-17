package com.bbg.market.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbg.market.common.ResponseResult;
import com.bbg.market.entity.Store;
import com.bbg.market.service.StoreService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hexian
 * @since 2019-12-04
 */
@RestController
@RequestMapping("/store")
public class StoreController {

	@Autowired
	private StoreService service;

	@PostMapping("/test")
	public ResponseResult<List<Store>> test() {
		ResponseResult<List<Store>> result = new ResponseResult<>();
		List<Store> list = service.list();
		result.setStatus(200);
		result.setMsg("SUCCESS");
		result.setData(list);
		return result;
	}

}
