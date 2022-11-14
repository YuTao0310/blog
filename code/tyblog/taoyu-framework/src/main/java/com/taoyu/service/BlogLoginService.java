package com.taoyu.service;

import com.taoyu.domain.ResponseResult;
import com.taoyu.domain.entity.User;

public interface BlogLoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
