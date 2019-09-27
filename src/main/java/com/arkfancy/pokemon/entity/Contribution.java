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
 * 贡献
 * </p>
 *
 * @author arkfancy
 * @since 2019-09-27
 */
@TableName("pokemon_contribution")
public class Contribution extends Model<Contribution> {

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
     * 贡献
     */
    @TableField("contribution")
    private Integer contribution;


    public Integer getId() {
        return id;
    }

    public Contribution setId(Integer id) {
        this.id = id;
        return this;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public Contribution setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
        return this;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public Contribution setMemberId(Integer memberId) {
        this.memberId = memberId;
        return this;
    }

    public Integer getContribution() {
        return contribution;
    }

    public Contribution setContribution(Integer contribution) {
        this.contribution = contribution;
        return this;
    }

    public static final String ID = "id";

    public static final String RECORD_DATE = "record_date";

    public static final String MEMBER_ID = "member_id";

    public static final String CONTRIBUTION = "contribution";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Contribution{" +
        "id=" + id +
        ", recordDate=" + recordDate +
        ", memberId=" + memberId +
        ", contribution=" + contribution +
        "}";
    }
}
