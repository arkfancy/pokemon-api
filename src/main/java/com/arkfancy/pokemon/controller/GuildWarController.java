package com.arkfancy.pokemon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arkfancy.pokemon.entity.GuildWar;
import com.arkfancy.pokemon.service.GuildWarService;
import com.baomidou.kisso.annotation.Login;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;

/**
 * <p>
 * 公会战 前端控制器
 * </p>
 *
 * @author arkfancy
 * @since 2020-01-01
 */
@RestController
@RequestMapping("/guild-war")
public class GuildWarController extends ApiController {

	@Autowired
	private GuildWarService guidWarService;

	@PostMapping("/list")
	@Login
	public R<List<GuildWar>> insertList(@RequestBody List<GuildWar> guildWars) {
		guidWarService.saveBatch(guildWars);
		return success(guildWars);
	}
}
