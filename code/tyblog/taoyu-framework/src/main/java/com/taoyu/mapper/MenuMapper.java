package com.taoyu.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.taoyu.domain.entity.Menu;

/**
 * <p>
 * 菜单权限表 Mapper 接口
 * </p>
 *
 * @author taoyu
 * @since 2022-11-13
 */
public interface MenuMapper extends BaseMapper<Menu> {

    List<String> selectPermsByUserId(Long id);

    List<Menu> selectAllRouterMenu();

    List<Menu> selectRouterMenuTreeByUserId(Long userId);

    List<Long> selectMenuListByRoleId(Long roleId);

}
