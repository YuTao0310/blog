package com.taoyu.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinkVo {

    private Long id;

    private String name;

    private String logo;

    private String description;

    /**
     * 网站地址
     */
    private String address;
}