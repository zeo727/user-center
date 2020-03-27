package com.itmuch.usercenter;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class LombokTest {
    //public static final Logger LOGGER = LoggerFactory.getLogger(LombokTest.class);

    public static void main(String[] args) {

        UserRegisterDTO userRegisterDTO = new UserRegisterDTO();
        userRegisterDTO.setEmail("xx");
        userRegisterDTO.setPassword("x");
        //...

        // 建造者模式
        UserRegisterDTO build = UserRegisterDTO.builder()
                .email("xx")
                .password("x")
                .confirmPassword("x")
                .agreement(true)
                .build();

        log.info("构造出来的UserRegisterDTO = {}",build);
    }
}
@Data
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor

@Builder
class UserRegisterDTO{
    private String email;
    private String password;
    private String confirmPassword;
    private String mobile;
    private boolean agreement;

}
