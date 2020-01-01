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
 * 公会战
 * </p>
 *
 * @author arkfancy
 * @since 2020-01-01
 */
@TableName("pokemon_guild_war")
public class GuildWar extends Model<GuildWar> {

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


    public Integer getId() {
        return id;
    }

    public GuildWar setId(Integer id) {
        this.id = id;
        return this;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public GuildWar setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
        return this;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public GuildWar setMemberId(Integer memberId) {
        this.memberId = memberId;
        return this;
    }

    public static final String ID = "id";

    public static final String RECORD_DATE = "record_date";

    public static final String MEMBER_ID = "member_id";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "GuildWar{" +
        "id=" + id +
        ", recordDate=" + recordDate +
        ", memberId=" + memberId +
        "}";
    }
}
