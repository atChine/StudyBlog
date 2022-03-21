package com.sangeng.mapper;

import com.sangeng.domain.Link;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author apple
* @description 针对表【sg_link(友链)】的数据库操作Mapper
* @createDate 2022-03-21 20:16:23
* @Entity com.sangeng.domain.Link
*/
@Mapper
public interface LinkMapper extends BaseMapper<Link> {

}




