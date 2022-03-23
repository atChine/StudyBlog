package com.sangeng.service;

import com.sangeng.domain.Comment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sangeng.result.ResponseResult;

/**
* @author apple
* @description 针对表【sg_comment(评论表)】的数据库操作Service
* @createDate 2022-03-23 09:47:58
*/
public interface CommentService extends IService<Comment> {
    /**
     * 查询评论列表
     *
     * @param articleComment
     * @param articleId 文章ID
     * @param pageNum
     * @param pageSize
     * @return
     */
    ResponseResult commentList(String articleComment, Long articleId, Integer pageNum, Integer pageSize);

    /**
     * 实现评论功能
     * @param comment
     * @return
     */
    ResponseResult addComment(Comment comment);
}
