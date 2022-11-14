package com.taoyu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taoyu.domain.ResponseResult;
import com.taoyu.domain.entity.Comment;

/**
 * <p>
 * 评论表 服务类
 * </p>
 *
 * @author taoyu
 * @since 2022-11-11
 */
public interface CommentService extends IService<Comment> {

    ResponseResult commentList(String commentType, Long articleId, Integer pageNum, Integer pageSize);

    ResponseResult addComment(Comment comment);

}
