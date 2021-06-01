package com.demo.core.user.common.service;

import com.demo.ibatx.core.entity.Condition;
import java.util.List;
import java.util.Map;
import com.demo.rpc.annotation.Remote;
import com.demo.core.user.common.po.User;
import com.demo.core.user.common.consts.Application;


/**
 * 用户表Service接口
 *
 * @author system
 * @date 2021/06/01 13:33
 */
@Remote(applicationName = Application.name)
public interface UserService {

    /**
     *  根据主键查询
     *
     *  @param   id  主键
     *  @return  User
     *  @author  system
     *  @date    2021/06/01 13:33
     */
   User get(Integer id);

    /**
     *  获取单个
     *
     *  @param   user  查询条件
     *  @return  User
     *  @author  system
     *  @date    2021/06/01 13:33
     */
    User getOne(User user);

    /**
     *  新增数据
     *
     *  @param   user  新增内容
     *  @return  int
     *  @author  system
     *  @date    2021/06/01 13:33
     */
    int save(User user);

    /**
     *  新增数据并取回数据
     *
     *  @param   user  新增内容
     *  @return  int
     *  @author  system
     *  @date    2021/06/01 13:33
     */
    User saveAndGet(User user);

    /**
     *  根据主键更新非空数据
     *
     *  @param   user  更新内容
     *  @return  int
     *  @author  system
     *  @date    2021/06/01 13:33
     */
    int update(User user);

    /**
     *  根据主键Id查询数据列表
     *
     *  @param   ids  主键值
     *  @return  User数组
     *  @author  system
     *  @date    2021/06/01 13:33
     */
    List<User> listByIds(List<Integer> ids);

    /**
     *  根据条件查询数据列表
     *
     *  @param   user  主键值
     *  @return  User数组
     *  @author  system
     *  @date    2021/06/01 13:33
     */
    List<User> list(User user);

    /**
     *  查询数据数量
     *
     *  @param   user  查询条件
     *  @return  int 符合条件的数量
     *  @author  system
     *  @date    2021/06/01 13:33
     */
    int count(User user);

    /**
     *  将符合查询条件数据列表转map
     *
     *  @param   ids  主键值
     *  @return  map  查询结果主键map
     *  @author  system
     *  @date    2021/06/01 13:33
     */
    Map<Integer, User> mapByIds(List<Integer> ids);

    /**
     *  查询数据列表
     *
     *  @param   condition  查询条件
     *  @return  User数组
     *  @author  system
     *  @date    2021/06/01 13:33
     */
    List<User> listByCondition(Condition<User> condition);

    /**
     *  查询符合条件的数量
     *
     *  @param   condition  查询条件
     *  @return  int  符合条件的数量
     *  @author  system
     *  @date    2021/06/01 13:33
     */
    int countByCondition(Condition<User> condition);

    /**
     *  根据主键物理删除
     *
     *  @param   id   数据主键
     *  @return  int  生效的数据
     *  @author  system
     *  @date    2021/06/01 13:33
     */
    int realDelete(Integer id);
    /**
     *  根据主键逻辑删除
     *
     *  @param   id   数据主键
     *  @return  int  生效的数据
     *  @author  system
     *  @date    2021/06/01 13:33
     */
    int softDelete(Integer id);
}
