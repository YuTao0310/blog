package com.taoyu.service;

import com.taoyu.domain.ResponseResult;
import com.taoyu.domain.entity.User;

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
