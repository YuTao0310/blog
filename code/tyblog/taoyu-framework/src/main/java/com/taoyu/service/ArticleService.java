package com.taoyu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taoyu.domain.ResponseResult;
import com.taoyu.domain.dto.AddArticleDto;
import com.taoyu.domain.entity.Article;
import com.taoyu.domain.entity.ArticleDto;
import com.taoyu.domain.vo.ArticleVo;
import com.taoyu.domain.vo.PageVo;


public interface ArticleService extends IService<Article> {

    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult getArticleDetail(Long id);

    ResponseResult updateViewCount(Long id);

    ResponseResult add(AddArticleDto article);

    PageVo selectArticlePage(Article article, Integer pageNum, Integer pageSize);

    ArticleVo getInfo(Long id);

    void edit(ArticleDto article);
}

