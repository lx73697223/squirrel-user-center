package com.pi.usercenter.endpoint.intf;

import com.pi.common.utils.aop.annotation.LogMethodReturn;
import com.pi.usercenter.endpoint.intf.hystrix.UserAccountClientHystrix;
import com.pi.usercenter.endpoint.vo.UserAccountVo;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Set;

@FeignClient(name = "pi-user-account-server", fallback = UserAccountClientHystrix.class)
@Qualifier("userAccountClient")
public interface UserAccountClient {

    @ApiImplicitParam(value = "根据id查询用户账号", example = "1,2,3", allowMultiple = true, required = true)
    @LogMethodReturn(level = LogMethodReturn.Level.INFO)
    @GetMapping(value = "/userAccounts", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    ResponseEntity<List<UserAccountVo>> getUserAccounts(@RequestParam("ids") Set<String> ids);

}

