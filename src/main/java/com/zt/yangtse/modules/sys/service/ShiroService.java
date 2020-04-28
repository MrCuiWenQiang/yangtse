package com.zt.yangtse.modules.sys.service;

import com.zt.yangtse.modules.sys.entity.SysUserEntity;
import com.zt.yangtse.modules.sys.entity.SysUserTokenEntity;

import java.util.Set;

public interface ShiroService {
    /**
     * 获取用户权限列表
     */
    Set<String> getUserPermissions(long userId);

    SysUserTokenEntity queryByToken(String token);

    /**
     * 根据用户ID，查询用户
     * @param userId
     */
    SysUserEntity queryUser(Long userId);
}
