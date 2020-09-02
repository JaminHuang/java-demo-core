package com.demo.core.user.service.mapper;

import com.demo.ibatx.mapper.Mapper;
import com.demo.ibatx.mapper.SoftDeleteMapper;
import com.demo.core.user.common.po.User;

/**
 * Users and global privilegesMapper
 * 
 * @author system
 * @date 2020-08-24T15:33:26.520
 */
public interface UserMapper extends Mapper<User>, SoftDeleteMapper<User> {
}