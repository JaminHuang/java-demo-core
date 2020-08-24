package com.demo.core.user.service.impl;

import com.db.ibatx.core.entity.Condition;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Collections;
import com.db.ibatx.core.entity.LimitCondition;
import com.demo.sdk.page.Page;
import com.demo.sdk.thread.ReqThreadLocal;
import com.demo.sdk.util.StringUtils;
import com.demo.sdk.util.CollectionUtils;
import com.demo.sdk.util.Assert;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import com.demo.core.user.common.po.User;
import com.demo.core.user.service.mapper.UserMapper;
import com.demo.core.user.common.service.UserService;

/**
 * Users and global privilegesService实现类
 *
 * @author system
 * @date 2020/08/24 15:33
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User get(Integer id) {
        return userMapper.getx(id);
    }

    @Override
    public User getOne(User user) {
        Assert.notNull(user, "user参数不能为空");
        return userMapper.getOnex(user);
    }

    @Override
    public int save(User user) {
        Assert.notNull(user, "user参数不能为空");
        if (StringUtils.isEmpty(user.getCreator())) {
            user.setCreator(ReqThreadLocal.getUserName());
        }
        if (StringUtils.isEmpty(user.getUpdater())) {
            user.setUpdater(ReqThreadLocal.getUserName());
        }
        return userMapper.savex(user);
    }

    @Override
    @Transactional
    public User saveAndGet(User user) {
        Assert.notNull(user, "user参数不能为空");
        if (StringUtils.isEmpty(user.getCreator())) {
            user.setCreator(ReqThreadLocal.getUserName());
        }
        if (StringUtils.isEmpty(user.getUpdater())) {
            user.setUpdater(ReqThreadLocal.getUserName());
        }
        userMapper.savex(user);
        if (Objects.nonNull(user.getId())) {
            return this.get(user.getId());
        }
        return user;
    }

    @Override
    public int update(User user) {
        Assert.notNull(user, "user参数不能为空");
        if (StringUtils.isEmpty(user.getUpdater())) {
            user.setUpdater(ReqThreadLocal.getUserName());
        }
        return userMapper.updatex(user);
    }

    @Override
    public List<User> listByIds(List<Integer> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return Collections.emptyList();
        }
        Condition<User> condition = new Condition<>();
        condition.createCriteria().andIn(User.ID, ids);
        condition.limit(Page.getMaxRow());
        return userMapper.listByConditionx(condition);
    }

    @Override
    public List<User> list(User user) {
        Assert.notNull(user, "user参数不能为空");
        return userMapper.listLimitx(user, new LimitCondition(user.getStart(), user.getRow()));
    }

    @Override
    public int count(User user) {
        Assert.notNull(user, "user参数不能为空");
        return userMapper.countx(user);
    }

    @Override
    public Map<Integer, User> mapByIds(List<Integer> ids) {
        List<User> userList  = this.listByIds(ids);
        return userList.stream().collect(Collectors.toMap(User::getId, Function.identity()));
    }

    @Override
    public List<User> listByCondition(Condition<User> condition) {
        Assert.notNull(condition, "condition参数不能为空");
        return userMapper.listByConditionx(condition);
    }

    @Override
    public int countByCondition(Condition<User> condition) {
        Assert.notNull(condition, "condition参数不能为空");
        return userMapper.countByConditionx(condition);
    }

    @Override
    public int realDelete(Integer id) {
        return userMapper.realDeletex(id);
    }

    @Override
    public int softDelete(Integer id){
        return userMapper.softDeletex(id);
    }
}
