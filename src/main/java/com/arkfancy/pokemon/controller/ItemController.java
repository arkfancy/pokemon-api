package com.arkfancy.pokemon.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arkfancy.pokemon.entity.Item;
import com.arkfancy.pokemon.support.util.IDCreator;
import com.baomidou.kisso.annotation.Login;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;

/**
 * <p>
 * 道具 前端控制器
 * </p>
 *
 * @author arkfancy
 * @since 2019-09-27
 */
@RestController
@RequestMapping("/item")
public class ItemController extends ApiController {

	@GetMapping("/list")
	public R<List<Item>> selectList() {
		return success(new Item().selectAll());
	}

	@PostMapping("")
	@Login
	public R<Item> insert(@RequestBody Item item) {
		item.setItemId(IDCreator.hashCodeId(item.getItemName())).insert();
		return success(item);
	}

}
