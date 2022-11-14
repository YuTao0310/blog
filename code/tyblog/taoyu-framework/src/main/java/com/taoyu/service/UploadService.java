package com.taoyu.service;

import org.springframework.web.multipart.MultipartFile;

import com.taoyu.domain.ResponseResult;

public interface UploadService {
    ResponseResult uploadImg(MultipartFile img);
}
