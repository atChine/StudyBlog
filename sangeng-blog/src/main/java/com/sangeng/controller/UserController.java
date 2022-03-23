package com.sangeng.controller;

import com.sangeng.domain.SysUser;
import com.sangeng.result.ResponseResult;
import com.sangeng.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private SysUserService userService;

    @GetMapping("userInfo")
    public ResponseResult userInfo(){
       return userService.userInfo();
    }
    @PutMapping("/userInfo")
    public ResponseResult updateUserInfo(@RequestBody SysUser user){
        return userService.updateUserInfo(user);
    }
    @PostMapping("/register")
    public ResponseResult register(@RequestBody SysUser user){
        return userService.register(user);
    }
}
