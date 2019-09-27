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
 * 
 * </p>
 *
 * @author arkfancy
 * @since 2019-09-27
 */
@TableName("pokemon_member")
public class Member extends Model<Member> {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 成员id
     */
    @TableField("member_id")
    private Integer memberId;

    /**
     * 成员名称
     */
    @TableField("member_name")
    private String memberName;

    /**
     * 加入时间
     */
    @TableField("join_date")
    private LocalDate joinDate;

    /**
     * 离开时间
     */
    @TableField("leave_date")
    private LocalDate leaveDate;


    public Integer getId() {
        return id;
    }

    public Member setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public Member setMemberId(Integer memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getMemberName() {
        return memberName;
    }

    public Member setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public Member setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
        return this;
    }

    public LocalDate getLeaveDate() {
        return leaveDate;
    }

    public Member setLeaveDate(LocalDate leaveDate) {
        this.leaveDate = leaveDate;
        return this;
    }

    public static final String ID = "id";

    public static final String MEMBER_ID = "member_id";

    public static final String MEMBER_NAME = "member_name";

    public static final String JOIN_DATE = "join_date";

    public static final String LEAVE_DATE = "leave_date";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Member{" +
        "id=" + id +
        ", memberId=" + memberId +
        ", memberName=" + memberName +
        ", joinDate=" + joinDate +
        ", leaveDate=" + leaveDate +
        "}";
    }
}
