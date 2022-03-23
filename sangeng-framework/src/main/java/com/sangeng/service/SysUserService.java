package com.sangeng.service;

import com.sangeng.domain.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sangeng.result.ResponseResult;

/**
* @author apple
* @description 针对表【sys_user(用户表)】的数据库操作Service
* @createDate 2022-03-22 13:38:02
*/
public interface SysUserService extends IService<SysUser> {
    /**
     * 个人信息查询
     * @return
     */
    ResponseResult userInfo();

    /**
     * 更新个人信息
     * @param user
     * @return
     */
    ResponseResult updateUserInfo(SysUser user);

    /**
     * 注册用户
     * @param user
     * @return
     */
    ResponseResult register(SysUser user);
}
