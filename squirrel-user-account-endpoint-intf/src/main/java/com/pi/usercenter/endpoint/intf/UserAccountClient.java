package com.pi.usercenter.endpoint.intf;

import com.pi.usercenter.endpoint.intf.hystrix.UserAccountClientHystrix;
import com.pi.usercenter.endpoint.vo.UserAccountVo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "pi-user-account-server", fallback = UserAccountClientHystrix.class)
@Qualifier("userAccountClient")
public interface UserAccountClient {

    @GetMapping("/userAccounts")
    List<UserAccountVo> getAllUserAccounts();

}

