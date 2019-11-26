package com.arkfancy.pokemon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 级别
 * </p>
 *
 * @author arkfancy
 * @since 2019-11-25
 */
@TableName("pokemon_rank")
public class Rank extends Model<Rank> {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 级别id
     */
    @TableField("rank_id")
    private Integer rankId;

    /**
     * 级别名称
     */
    @TableField("rank_name")
    private String rankName;

    /**
     * 活跃度系数
     */
    @TableField("activity_coefficient")
    private Double activityCoefficient;


    public Integer getId() {
        return id;
    }

    public Rank setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getRankId() {
        return rankId;
    }

    public Rank setRankId(Integer rankId) {
        this.rankId = rankId;
        return this;
    }

    public String getRankName() {
        return rankName;
    }

    public Rank setRankName(String rankName) {
        this.rankName = rankName;
        return this;
    }

    public Double getActivityCoefficient() {
        return activityCoefficient;
    }

    public Rank setActivityCoefficient(Double activityCoefficient) {
        this.activityCoefficient = activityCoefficient;
        return this;
    }

    public static final String ID = "id";

    public static final String RANK_ID = "rank_id";

    public static final String RANK_NAME = "rank_name";

    public static final String ACTIVITY_COEFFICIENT = "activity_coefficient";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Rank{" +
        "id=" + id +
        ", rankId=" + rankId +
        ", rankName=" + rankName +
        ", activityCoefficient=" + activityCoefficient +
        "}";
    }
}
