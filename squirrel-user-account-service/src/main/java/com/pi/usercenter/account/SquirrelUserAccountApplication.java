package com.pi.usercenter.account;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class SquirrelUserAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(SquirrelUserAccountApplication.class, args);
    }

}
