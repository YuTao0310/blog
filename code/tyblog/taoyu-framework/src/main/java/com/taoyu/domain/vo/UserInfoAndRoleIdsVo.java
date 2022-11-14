package com.taoyu.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.taoyu.domain.entity.Role;
import com.taoyu.domain.entity.User;


@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoAndRoleIdsVo {
    private User user;
    private List<Role> roles;
    private List<Long> roleIds;
}
