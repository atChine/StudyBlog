package com.sangeng.mapper;

import com.sangeng.domain.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author apple
* @description 针对表【sg_category(分类表)】的数据库操作Mapper
* @createDate 2022-03-20 18:23:25
* @Entity com.sangeng.domain.Category
*/
@Repository
public interface CategoryMapper extends BaseMapper<Category> {

}




