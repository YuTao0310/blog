package com.taoyu.domain.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 角色和菜单关联表
 * </p>
 *
 * @author taoyu
 * @since 2022-11-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class RoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
      private Long roleId;

    /**
     * 菜单ID
     */
    private Long menuId;


}
