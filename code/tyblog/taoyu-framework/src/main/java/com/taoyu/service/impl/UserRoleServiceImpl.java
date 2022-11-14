package com.taoyu.service.impl;

import com.taoyu.domain.entity.UserRole;
import com.taoyu.mapper.UserRoleMapper;
import com.taoyu.service.UserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户和角色关联表 服务实现类
 * </p>
 *
 * @author taoyu
 * @since 2022-11-13
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}
