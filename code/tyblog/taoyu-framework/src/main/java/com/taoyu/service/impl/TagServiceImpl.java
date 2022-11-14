package com.taoyu.service.impl;

import com.taoyu.domain.ResponseResult;
import com.taoyu.domain.dto.TagListDto;
import com.taoyu.domain.entity.Tag;
import com.taoyu.domain.vo.PageVo;
import com.taoyu.domain.vo.TagVo;
import com.taoyu.mapper.TagMapper;
import com.taoyu.service.TagService;
import com.taoyu.utils.BeanCopyUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 标签 服务实现类
 * </p>
 *
 * @author taoyu
 * @since 2022-11-13
 */
@Service("tagService")
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

    @Override
    public ResponseResult<PageVo> pageTagList(Integer pageNum, Integer pageSize, TagListDto tagListDto) {
        //分页查询
        LambdaQueryWrapper<Tag> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(StringUtils.hasText(tagListDto.getName()),Tag::getName,tagListDto.getName());
        queryWrapper.eq(StringUtils.hasText(tagListDto.getRemark()),Tag::getRemark,tagListDto.getRemark());

        Page<Tag> page = new Page<>();
        page.setCurrent(pageNum);
        page.setSize(pageSize);
        page(page, queryWrapper);
        //封装数据返回
        PageVo pageVo = new PageVo(page.getRecords(),page.getTotal());
        return ResponseResult.okResult(pageVo);
    }

    @Override
    public List<TagVo> listAllTag() {
        LambdaQueryWrapper<Tag> wrapper = new LambdaQueryWrapper<>();
        wrapper.select(Tag::getId,Tag::getName);
        List<Tag> list = list(wrapper);
        List<TagVo> tagVos = BeanCopyUtils.copyBeanList(list, TagVo.class);
        return tagVos;
    }
}
