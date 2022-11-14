package com.taoyu.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taoyu.domain.ResponseResult;
import com.taoyu.domain.entity.Role;

/**
 * <p>
 * 角色信息表 服务类
 * </p>
 *
 * @author taoyu
 * @since 2022-11-13
 */
public interface RoleService extends IService<Role> {

    List<String> selectRoleKeyByUserId(Long id);

    List<Role> selectRoleAll();

    void updateRole(Role role);

    void insertRole(Role role);

    ResponseResult selectRolePage(Role role, Integer pageNum, Integer pageSize);

    List<Long> selectRoleIdByUserId(Long userId);
}
