package com.taoyu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taoyu.domain.ResponseResult;
import com.taoyu.domain.entity.Link;
import com.taoyu.domain.vo.PageVo;

/**
 * <p>
 * 友链 服务类
 * </p>
 *
 * @author taoyu
 * @since 2022-11-11
 */
public interface LinkService extends IService<Link> {

    ResponseResult getAllLink();

    PageVo selectLinkPage(Link link, Integer pageNum, Integer pageSize);

}
