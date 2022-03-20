package com.sangeng.service;

import com.sangeng.domain.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sangeng.result.ResponseResult;

/**
* @author apple
* @description 针对表【sg_category(分类表)】的数据库操作Service
* @createDate 2022-03-20 18:23:25
*/
public interface CategoryService extends IService<Category> {
    /**
     * 查询类别列表
     * @return
     */
    ResponseResult getCategoryList();

}
