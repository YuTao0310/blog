package com.taoyu.service;

import com.taoyu.domain.ResponseResult;
import com.taoyu.domain.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

public interface UserService extends IService<User>{

    ResponseResult userInfo();

    ResponseResult updateUserInfo(User user);

    ResponseResult register(User user);

    ResponseResult selectUserPage(User user, Integer pageNum, Integer pageSize);

    boolean checkUserNameUnique(String userName);

    boolean checkPhoneUnique(User user);

    boolean checkEmailUnique(User user);

    ResponseResult addUser(User user);

    void updateUser(User user);
    
}
