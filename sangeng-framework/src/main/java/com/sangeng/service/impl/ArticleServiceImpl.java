package com.sangeng.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sangeng.constants.SystemConstants;
import com.sangeng.domain.Category;
import com.sangeng.result.ResponseResult;
import com.sangeng.service.ArticleService;
import com.sangeng.domain.Article;
import com.sangeng.mapper.ArticleMapper;
import com.sangeng.service.CategoryService;
import com.sangeng.utils.BeanCopyUtils;
import com.sangeng.vo.ArticleDetailVo;
import com.sangeng.vo.ArticleListVo;
import com.sangeng.vo.HotArticleVo;
import com.sangeng.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
* @author apple
* @description 针对表【sg_article(文章表)】的数据库操作Service实现
* @createDate 2022-03-20 15:11:56
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private CategoryService categoryService;
    @Override
    public ResponseResult hotArticleList() {
        LambdaQueryWrapper<Article> queryWrapper = new LambdaQueryWrapper<>();
        //必须是正式文章
        queryWrapper.eq(Article::getStatus, SystemConstants.ARTICLE_STATUS_NORMAL);
        //按浏览量进行排序
        queryWrapper.orderByDesc(Article::getViewCount);
        //最多只查询10条
        Page<Article> page = new Page(1, 10);
        page(page,queryWrapper);
        List<Article> articles = page.getRecords();
        //Bean 拷贝
        List<HotArticleVo> hotArticleVos = BeanCopyUtils.copyBeanList(articles, HotArticleVo.class);
        return ResponseResult.okResult(hotArticleVos);
    }

    @Override
    public ResponseResult articleList(Integer pageNum, Integer pageSize, Integer categoryId) {
        //查询条件：判断是否有catrgoryId，
        LambdaQueryWrapper<Article> articleWrapper = new LambdaQueryWrapper<>();
        articleWrapper.eq(Objects.nonNull(categoryId) && categoryId > 0,Article::getCategoryId,categoryId);
        //状态是否是正常状态
        articleWrapper.eq(Article::getStatus,SystemConstants.ARTICLE_STATUS_NORMAL);
        //置顶，对isTag倒叙排序
        articleWrapper.orderByDesc(Article::getIsTop);
        //分页查询
        Page<Article> page = new Page<>(pageNum,pageSize);
        page(page,articleWrapper);
        List<Article> articleList = page.getRecords();
        //查询categoryName
        articleList.stream()
                .map(article -> article.setCategoryName(categoryService.getById(article.getCategoryId()).getName()))
                .collect(Collectors.toList());
                //.map(article -> article.setCategoryName(categoryService.getById(article.getCategoryId()).getName()))
                //.collect(Collectors.toList());
        //封装查询结果
        List<ArticleListVo> articleListVo = BeanCopyUtils.copyBeanList(articleList, ArticleListVo.class);
        PageVo pageVo = new PageVo(articleListVo, page.getTotal());
        return ResponseResult.okResult(pageVo);
    }

    @Override
    public ResponseResult getArticleDetail(Long id) {
        Article article = getById(id);
        ArticleDetailVo articleDetailVo = BeanCopyUtils.copyBean(article, ArticleDetailVo.class);
        Long categoryId = articleDetailVo.getCategoryId();
        Category category = categoryService.getById(categoryId);
        if (category != null){
            articleDetailVo.setCategoryName(category.getName());
        }else {
            articleDetailVo.setCategoryName("此用户以注销");
        }
        return ResponseResult.okResult(articleDetailVo);
    }
}




