package com.arkfancy.pokemon.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arkfancy.pokemon.entity.Rank;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;

/**
 * <p>
 * 级别 前端控制器
 * </p>
 *
 * @author arkfancy
 * @since 2019-11-25
 */
@RestController
@RequestMapping("/rank")
public class RankController extends ApiController {

	@GetMapping("/list")
	public R<List<Rank>> selectList() {
		return success(new Rank().selectAll());
	}

}
