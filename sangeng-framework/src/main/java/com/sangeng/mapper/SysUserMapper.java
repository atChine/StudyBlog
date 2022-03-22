package com.sangeng.mapper;

import com.sangeng.domain.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author apple
* @description 针对表【sys_user(用户表)】的数据库操作Mapper
* @createDate 2022-03-22 13:38:02
* @Entity com.sangeng.domain.SysUser
*/
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}




