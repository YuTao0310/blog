package com.taoyu.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.taoyu.domain.entity.Role;

/**
 * <p>
 * 角色信息表 Mapper 接口
 * </p>
 *
 * @author taoyu
 * @since 2022-11-13
 */
public interface RoleMapper extends BaseMapper<Role> {

    List<String> selectRoleKeyByUserId(Long id);

    List<Long> selectRoleIdByUserId(Long userId);

}
