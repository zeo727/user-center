package com.itmuch.usercenter;

import com.itmuch.usercenter.dao.user.UserMapper;
import com.itmuch.usercenter.domain.entity.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestController {

    /**
     * 作业1：课后研究一下@Resourse和@Autowired区别
     * 面试题
     */
    //@Resource
    private final UserMapper userMapper;


    @GetMapping("/test")
    public User testInsert(){
        User user = new User();
        user.setAvatarUrl("xxx");
        user.setBonus(100);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());

        this.userMapper.insertSelective(user);
        return user;
    }

    @GetMapping("/q")
    public User query(User user){
        return user;
    }
}
