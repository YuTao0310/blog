package com.taoyu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taoyu.domain.ResponseResult;
import com.taoyu.domain.entity.Article;
import com.taoyu.service.ArticleService;

@RestController
@RequestMapping("/article")
public class ArticleController {
    
    @Autowired
    ArticleService articleService;

    // @GetMapping("/")
    // List<Article> test() {
    //     return articleService.list();
    // }

    @GetMapping("/hotArticleList")
    public ResponseResult hotArticleList(){

        ResponseResult result =  articleService.hotArticleList();
        return result;
    }
    
    @GetMapping("/articleList")
    public ResponseResult articleList(Integer pageNum,Integer pageSize,Long categoryId){
        return articleService.articleList(pageNum,pageSize,categoryId);
    }

    @PutMapping("/updateViewCount/{id}")
    public ResponseResult updateViewCount(@PathVariable("id") Long id){
        return articleService.updateViewCount(id);
    }

    @GetMapping("/{id}")
    public ResponseResult getArticleDetail(@PathVariable("id") Long id){
        return articleService.getArticleDetail(id);
    }
}
