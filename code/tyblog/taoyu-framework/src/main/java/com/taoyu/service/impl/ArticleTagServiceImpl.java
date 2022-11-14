package com.taoyu.service.impl;

import com.taoyu.domain.entity.ArticleTag;
import com.taoyu.mapper.ArticleTagMapper;
import com.taoyu.service.ArticleTagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章标签关联表 服务实现类
 * </p>
 *
 * @author taoyu
 * @since 2022-11-11
 */
@Service
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagMapper, ArticleTag> implements ArticleTagService {

}
