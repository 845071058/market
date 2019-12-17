package com.bbg.market.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
public class Store extends Model<Store> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "storeId", type = IdType.AUTO)
    private Integer storeId;

    @TableField("storeName")
    private String storeName;

    private String address;

    @TableField("telePhone")
    private String telePhone;

    private String introduce;

    /**
     * 标语
     */
    private String slogan;

    @TableField("beginTime")
    private LocalDateTime beginTime;

    @TableField("endTime")
    private LocalDateTime endTime;

    private String license;


    @Override
    protected Serializable pkVal() {
        return this.storeId;
    }

}
