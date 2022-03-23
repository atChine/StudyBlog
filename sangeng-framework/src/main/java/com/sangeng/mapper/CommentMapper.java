package com.sangeng.mapper;

import com.sangeng.domain.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author apple
* @description 针对表【sg_comment(评论表)】的数据库操作Mapper
* @createDate 2022-03-23 09:47:58
* @Entity com.sangeng.domain.Comment
*/
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {

}




