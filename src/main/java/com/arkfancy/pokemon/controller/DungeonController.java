package com.arkfancy.pokemon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arkfancy.pokemon.entity.Dungeon;
import com.arkfancy.pokemon.service.DungeonService;
import com.baomidou.kisso.annotation.Login;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;

/**
 * <p>
 * 副本 前端控制器
 * </p>
 *
 * @author arkfancy
 * @since 2019-11-25
 */
@RestController
@RequestMapping("/dungeon")
public class DungeonController extends ApiController {

	@Autowired
	private DungeonService dungeonService;

	@PostMapping("/list")
	@Login
	public R<List<Dungeon>> insertList(@RequestBody List<Dungeon> dungeons) {
		dungeonService.saveBatch(dungeons);
		return success(dungeons);
	}

	@GetMapping("/list")
	public R<List<Dungeon>> selectList(@RequestParam(required = false) String recordDate) {
		return success(dungeonService.selectDungeonList(recordDate));
	}

	@GetMapping("/sum")
	public R<List<Dungeon>> sum(@RequestParam(required = false) String previousDate,
			@RequestParam(required = false) String currentDate) {
		return success(dungeonService.selectDungeonContributionSum(previousDate, currentDate));
	}
}
