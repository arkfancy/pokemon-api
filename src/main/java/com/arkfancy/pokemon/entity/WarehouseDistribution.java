package com.arkfancy.pokemon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 仓库分配
 * </p>
 *
 * @author arkfancy
 * @since 2019-09-27
 */
@TableName("pokemon_warehouse_distribution")
public class WarehouseDistribution extends Model<WarehouseDistribution> {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 记录日期
     */
    @TableField("record_date")
    private LocalDate recordDate;

    /**
     * 成员id
     */
    @TableField("member_id")
    private Integer memberId;

    /**
     * 道具id
     */
    @TableField("item_id")
    private Integer itemId;

    /**
     * 数量
     */
    @TableField("quantity")
    private Integer quantity;


    public Integer getId() {
        return id;
    }

    public WarehouseDistribution setId(Integer id) {
        this.id = id;
        return this;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public WarehouseDistribution setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
        return this;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public WarehouseDistribution setMemberId(Integer memberId) {
        this.memberId = memberId;
        return this;
    }

    public Integer getItemId() {
        return itemId;
    }

    public WarehouseDistribution setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public WarehouseDistribution setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public static final String ID = "id";

    public static final String RECORD_DATE = "record_date";

    public static final String MEMBER_ID = "member_id";

    public static final String ITEM_ID = "item_id";

    public static final String QUANTITY = "quantity";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "WarehouseDistribution{" +
        "id=" + id +
        ", recordDate=" + recordDate +
        ", memberId=" + memberId +
        ", itemId=" + itemId +
        ", quantity=" + quantity +
        "}";
    }
}
