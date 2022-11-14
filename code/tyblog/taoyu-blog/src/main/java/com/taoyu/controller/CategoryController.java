package com.taoyu.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.taoyu.domain.ResponseResult;
import com.taoyu.service.CategoryService;

/**
 * <p>
 * 分类表 前端控制器
 * </p>
 *
 * @author taoyu
 * @since 2022-11-11
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/getCategoryList")
    public ResponseResult getCategoryList(){
       return categoryService.getCategoryList();
    }
}

