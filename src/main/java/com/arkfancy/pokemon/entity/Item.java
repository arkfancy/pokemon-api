package com.arkfancy.pokemon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 道具
 * </p>
 *
 * @author arkfancy
 * @since 2019-09-27
 */
@TableName("pokemon_item")
public class Item extends Model<Item> {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 道具id
     */
    @TableField("item_id")
    private Integer itemId;

    /**
     * 道具名称
     */
    @TableField("item_name")
    private String itemName;


    public Integer getId() {
        return id;
    }

    public Item setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getItemId() {
        return itemId;
    }

    public Item setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    public String getItemName() {
        return itemName;
    }

    public Item setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    public static final String ID = "id";

    public static final String ITEM_ID = "item_id";

    public static final String ITEM_NAME = "item_name";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Item{" +
        "id=" + id +
        ", itemId=" + itemId +
        ", itemName=" + itemName +
        "}";
    }
}
