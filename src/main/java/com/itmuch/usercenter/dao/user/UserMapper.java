package com.itmuch.usercenter.dao.user;

import com.itmuch.usercenter.domain.entity.user.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * 作业2：研究@Repository @Component @Service @Controller之间区别与联系
 * //面试题
 */
public interface UserMapper extends Mapper<User> {
}