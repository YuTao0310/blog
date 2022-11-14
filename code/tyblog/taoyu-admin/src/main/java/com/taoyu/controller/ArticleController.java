package com.taoyu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.taoyu.domain.ResponseResult;
import com.taoyu.domain.dto.AddArticleDto;
import com.taoyu.domain.entity.Article;
import com.taoyu.domain.entity.ArticleDto;
import com.taoyu.domain.vo.ArticleVo;
import com.taoyu.domain.vo.PageVo;
import com.taoyu.service.ArticleService;

@RestController
@RequestMapping("/content/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping
    public ResponseResult add(@RequestBody AddArticleDto article){
        return articleService.add(article);
    }

    @GetMapping("/list")
    public ResponseResult list(Article article, Integer pageNum, Integer pageSize)
    {
        PageVo pageVo = articleService.selectArticlePage(article,pageNum,pageSize);
        return ResponseResult.okResult(pageVo);
    }

    @GetMapping(value = "/{id}")
    public ResponseResult getInfo(@PathVariable(value = "id")Long id){
        ArticleVo article = articleService.getInfo(id);
        return ResponseResult.okResult(article);
    }

    @PutMapping
    public ResponseResult edit(@RequestBody ArticleDto article){
        articleService.edit(article);
        return ResponseResult.okResult();
    }
    @DeleteMapping("/{id}")
    public ResponseResult delete(@PathVariable Long id){
        articleService.removeById(id);
        return ResponseResult.okResult();
    }
}
