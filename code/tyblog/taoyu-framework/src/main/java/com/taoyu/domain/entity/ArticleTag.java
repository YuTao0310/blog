package com.taoyu.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 文章标签关联表
 * </p>
 *
 * @author taoyu
 * @since 2022-11-11
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ArticleTag implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章id
     */
      @TableId(value = "article_id", type = IdType.AUTO)
    private Long articleId;

    /**
     * 标签id
     */
    private Long tagId;


}
