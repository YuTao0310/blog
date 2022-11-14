package com.taoyu.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taoyu.domain.entity.Menu;

/**
 * <p>
 * 菜单权限表 服务类
 * </p>
 *
 * @author taoyu
 * @since 2022-11-13
 */
public interface MenuService extends IService<Menu> {

    List<String> selectPermsByUserId(Long id);

    List<Menu> selectRouterMenuTreeByUserId(Long userId);

    List<Menu> selectMenuList(Menu menu);

    boolean hasChild(Long menuId);

    List<Long> selectMenuListByRoleId(Long roleId);

}
