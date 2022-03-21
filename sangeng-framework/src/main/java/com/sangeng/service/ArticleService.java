package com.sangeng.service;

import com.sangeng.domain.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sangeng.result.ResponseResult;

/**
* @author apple
* @description 针对表【sg_article(文章表)】的数据库操作Service
* @createDate 2022-03-20 15:11:56
*/
public interface ArticleService extends IService<Article> {
    /**
     * 查询最热文章www
     * @return
     */
    ResponseResult hotArticleList();

    /**
     * 查询分页文章
     * @param pageNum
     * @param pageSize
     * @param categoryId
     * @return
     */
    ResponseResult articleList(Integer pageNum, Integer pageSize, Integer categoryId);

    /**
     * 查询文章详情
     * @param id
     * @return
     */
    ResponseResult getArticleDetail(Long id);
}
