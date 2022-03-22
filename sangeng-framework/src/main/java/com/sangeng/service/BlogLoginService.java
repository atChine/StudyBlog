package com.sangeng.service;


import com.sangeng.domain.SysUser;
import com.sangeng.result.ResponseResult;

public interface BlogLoginService {
    /**
     * 注册
     * @param user
     * @return
     */
    ResponseResult login(SysUser user);
}
