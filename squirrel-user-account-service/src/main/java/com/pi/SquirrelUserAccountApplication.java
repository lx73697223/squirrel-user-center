package com.pi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
@MapperScan("com.pi.usercenter.account.dao.mapper")
@EnableOAuth2Sso
public class SquirrelUserAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(SquirrelUserAccountApplication.class, args);
    }

}
