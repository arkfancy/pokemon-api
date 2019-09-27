package com.arkfancy.pokemon.service.impl;

import com.arkfancy.pokemon.entity.Item;
import com.arkfancy.pokemon.mapper.ItemMapper;
import com.arkfancy.pokemon.service.ItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 道具 服务实现类
 * </p>
 *
 * @author arkfancy
 * @since 2019-09-27
 */
@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements ItemService {

}
