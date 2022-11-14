package com.taoyu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.taoyu.domain.ResponseResult;
import com.taoyu.service.LinkService;

/**
 * <p>
 * 友链 前端控制器
 * </p>
 *
 * @author taoyu
 * @since 2022-11-11
 */
@RestController
@RequestMapping("/link")
public class LinkController {
    
    @Autowired
    private LinkService linkService;

    @GetMapping("/getAllLink")
    public ResponseResult getAllLink(){
        return linkService.getAllLink();
    }    
}

