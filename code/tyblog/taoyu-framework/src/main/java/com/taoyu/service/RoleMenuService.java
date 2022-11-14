package com.taoyu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taoyu.domain.entity.RoleMenu;

/**
 * <p>
 * 角色和菜单关联表 服务类
 * </p>
 *
 * @author taoyu
 * @since 2022-11-13
 */
public interface RoleMenuService extends IService<RoleMenu> {

    void deleteRoleMenuByRoleId(Long id);

}
