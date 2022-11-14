package com.taoyu.domain.entity;

import java.io.Serializable;

import org.mapstruct.Named;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 用户和角色关联表
 * </p>
 *
 * @author taoyu
 * @since 2022-11-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class UserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
      private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;


}
