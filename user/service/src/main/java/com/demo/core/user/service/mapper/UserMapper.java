package com.demo.core.user.service.mapper;

import com.demo.core.user.common.po.User;
import com.demo.ibatx.mapper.Mapper;
import com.demo.ibatx.mapper.SoftDeleteMapper;

/**
 * 用户表Mapper
 * 
 * @author system
 * @date 2021-06-01T13:33:21.804
 */
public interface UserMapper extends Mapper<User>, SoftDeleteMapper<User> {
}