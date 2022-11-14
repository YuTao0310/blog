package com.taoyu.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 友链
 * </p>
 *
 * @author taoyu
 * @since 2022-11-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Link implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private String logo;

    private String description;

    /**
     * 网站地址
     */
    private String address;

    /**
     * 审核状态 (0代表审核通过，1代表审核未通过，2代表未审核)
     */
    private String status;

    private Long createBy;

    private LocalDateTime createTime;

    private Long updateBy;

    private LocalDateTime updateTime;

    /**
     * 删除标志（0代表未删除，1代表已删除）
     */
    private Integer delFlag;


}
