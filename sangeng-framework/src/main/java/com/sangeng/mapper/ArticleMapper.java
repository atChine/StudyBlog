package com.sangeng.mapper;

import com.sangeng.domain.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author apple
* @description 针对表【sg_article(文章表)】的数据库操作Mapper
* @createDate 2022-03-20 15:11:56
* @Entity generator.domain.Article
*/
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

}




