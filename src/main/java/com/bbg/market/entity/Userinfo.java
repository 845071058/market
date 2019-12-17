package com.bbg.market.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author hexian
 * @since 2019-12-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Userinfo extends Model<Userinfo> {

    private static final long serialVersionUID = 1L;

    @TableId("userId")
    private Integer userId;

    @TableField("userName")
    private String userName;

    @TableField("userPwd")
    private String userPwd;

    @TableField("telePhone")
    private String telePhone;

    @TableField("roleId")
    private Integer roleId;

    @TableField("storeId")
    private Integer storeId;

    private String name;

    private String email;

    private String qq;

    /**
     * 头像地址
     */
    @TableField("headPic")
    private String headPic;


    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

}
