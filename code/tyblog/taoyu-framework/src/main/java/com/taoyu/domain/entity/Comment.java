package com.taoyu.domain.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 评论表
 * </p>
 *
 * @author taoyu
 * @since 2022-11-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 评论类型（0代表文章评论，1代表友链评论）
     */
    private String type;

    /**
     * 文章id
     */
    private Long articleId;

    /**
     * 根评论id
     */
    private Long rootId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 所回复的目标评论的userid
     */
    private Long toCommentUserId;

    /**
     * 回复目标评论id
     */
    private Long toCommentId;

    /**
     * 创建人的用户id
     */
    @TableField(fill = FieldFill.INSERT)
    private Long createBy;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    /**
     * 更新人
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateBy;
    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 删除标志（0代表未删除，1代表已删除）
     */
    private Integer delFlag;


}
