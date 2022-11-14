package com.taoyu.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taoyu.domain.ResponseResult;
import com.taoyu.domain.entity.Category;
import com.taoyu.domain.vo.CategoryVo;
import com.taoyu.domain.vo.PageVo;

/**
 * <p>
 * 分类表 服务类
 * </p>
 *
 * @author taoyu
 * @since 2022-11-11
 */
public interface CategoryService extends IService<Category> {

    ResponseResult getCategoryList();

    List<CategoryVo> listAllCategory();

    PageVo selectCategoryPage(Category category, Integer pageNum, Integer pageSize);

}
