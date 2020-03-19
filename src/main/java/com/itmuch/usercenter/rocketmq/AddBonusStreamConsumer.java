package com.itmuch.usercenter.rocketmq;

import com.alibaba.fastjson.JSON;
import com.itmuch.usercenter.domain.dto.messaging.UserAddBonusMsgDto;
import com.itmuch.usercenter.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AddBonusStreamConsumer {
    private final UserService userService;

    @StreamListener(Sink.INPUT)
    public void receive(String message){
        UserAddBonusMsgDto userAddBonusMsgDto  = JSON.parseObject(message, UserAddBonusMsgDto.class);
        this.userService.addBonus(userAddBonusMsgDto);

    }
}
