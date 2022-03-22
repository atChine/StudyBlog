package com.sangeng.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.sangeng.domain.LoginUser;
import com.sangeng.domain.SysUser;
import com.sangeng.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private SysUserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //根据用户名查询信息
        LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SysUser::getUserName,s);
        SysUser user = userMapper.selectOne(queryWrapper);
        //判断是否有此用户
        if (Objects.isNull(user)){
            throw new RuntimeException("没有此用户");
        }
        //如果有，封装成UserDetails形式，返回

        return new LoginUser(user);
    }
}
