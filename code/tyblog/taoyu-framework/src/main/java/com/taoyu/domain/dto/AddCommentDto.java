package com.taoyu.domain.dto;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "添加评论dto")
public class AddCommentDto {

    private Long id;

    /**
     * 评论类型（0代表文章评论，1代表友链评论）
     */
    @ApiModelProperty("评论类型（0代表文章评论，1代表友链评论）")
    private String type;

    /**
     * 文章id
     */
    @ApiModelProperty(notes = "文章id")
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
    private Long createBy;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新人
     */
    private Long updateBy;
    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 删除标志（0代表未删除，1代表已删除）
     */
    private Integer delFlag;


}
