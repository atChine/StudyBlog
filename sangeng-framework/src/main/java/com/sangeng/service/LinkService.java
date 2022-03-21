package com.sangeng.service;

import com.sangeng.domain.Link;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sangeng.result.ResponseResult;

/**
* @author apple
* @description 针对表【sg_link(友链)】的数据库操作Service
* @createDate 2022-03-21 20:16:23
*/
public interface LinkService extends IService<Link> {
    /**
     * 获取友链
     * @return
     */
    ResponseResult getAllLink();

}
