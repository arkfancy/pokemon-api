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
 * 副本
 * </p>
 *
 * @author arkfancy
 * @since 2019-11-25
 */
@TableName("pokemon_dungeon")
public class Dungeon extends Model<Dungeon> {

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
     * 副本贡献
     */
    @TableField("dungeon_contribution")
    private Integer dungeonContribution;


    public Integer getId() {
        return id;
    }

    public Dungeon setId(Integer id) {
        this.id = id;
        return this;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public Dungeon setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
        return this;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public Dungeon setMemberId(Integer memberId) {
        this.memberId = memberId;
        return this;
    }

    public Integer getDungeonContribution() {
        return dungeonContribution;
    }

    public Dungeon setDungeonContribution(Integer dungeonContribution) {
        this.dungeonContribution = dungeonContribution;
        return this;
    }

    public static final String ID = "id";

    public static final String RECORD_DATE = "record_date";

    public static final String MEMBER_ID = "member_id";

    public static final String DUNGEON_CONTRIBUTION = "dungeon_contribution";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Dungeon{" +
        "id=" + id +
        ", recordDate=" + recordDate +
        ", memberId=" + memberId +
        ", dungeonContribution=" + dungeonContribution +
        "}";
    }
}
