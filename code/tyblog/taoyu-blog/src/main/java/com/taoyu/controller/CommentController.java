package com.taoyu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.taoyu.domain.ResponseResult;
import com.taoyu.domain.constants.SystemConstants;
import com.taoyu.domain.dto.AddCommentDto;
import com.taoyu.domain.entity.Comment;
import com.taoyu.service.CommentService;
import com.taoyu.utils.BeanCopyUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 * 评论表 前端控制器
 * </p>
 *
 * @author taoyu
 * @since 2022-11-11
 */
@RestController
@RequestMapping("/comment")
@Api(tags = "评论",description = "评论相关接口")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping
    public ResponseResult addComment(@RequestBody AddCommentDto addCommentDto){
        Comment comment = BeanCopyUtils.copyBean(addCommentDto, Comment.class);
        return commentService.addComment(comment);
    }
    
    @GetMapping("/commentList")
    public ResponseResult commentList(Long articleId,Integer pageNum,Integer pageSize){
        return commentService.commentList(SystemConstants.ARTICLE_COMMENT,articleId,pageNum,pageSize);
    }   
    @GetMapping("/linkCommentList")
    @ApiOperation(value = "友链评论列表",notes = "获取一页友链评论")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "pageNum",value = "页号"),
        @ApiImplicitParam(name = "pageSize",value = "每页大小")
    }
    )
    public ResponseResult linkCommentList(Integer pageNum,Integer pageSize){
        return commentService.commentList(SystemConstants.LINK_COMMENT,null,pageNum,pageSize);
    }
}

