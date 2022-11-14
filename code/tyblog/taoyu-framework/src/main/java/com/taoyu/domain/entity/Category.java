package com.taoyu.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 分类表
 * </p>
 *
 * @author taoyu
 * @since 2022-11-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 分类名
     */
    private String name;

    /**
     * 父分类id，如果没有父分类为-1
     */
    private Long pid;

    /**
     * 描述
     */
    private String description;

    /**
     * 状态0:正常,1禁用
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
