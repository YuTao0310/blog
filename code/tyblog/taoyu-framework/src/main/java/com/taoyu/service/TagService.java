package com.taoyu.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taoyu.domain.ResponseResult;
import com.taoyu.domain.dto.TagListDto;
import com.taoyu.domain.entity.Tag;
import com.taoyu.domain.vo.PageVo;
import com.taoyu.domain.vo.TagVo;

/**
 * <p>
 * 标签 服务类
 * </p>
 *
 * @author taoyu
 * @since 2022-11-13
 */
public interface TagService extends IService<Tag> {

    ResponseResult<PageVo> pageTagList(Integer pageNum, Integer pageSize, TagListDto tagListDto);

    List<TagVo> listAllTag();
}

