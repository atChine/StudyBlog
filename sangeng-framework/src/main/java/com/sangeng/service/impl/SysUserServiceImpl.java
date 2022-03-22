package com.sangeng.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sangeng.domain.SysUser;
import com.sangeng.service.SysUserService;
import com.sangeng.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
* @author apple
* @description 针对表【sys_user(用户表)】的数据库操作Service实现
* @createDate 2022-03-22 13:38:02
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

}




