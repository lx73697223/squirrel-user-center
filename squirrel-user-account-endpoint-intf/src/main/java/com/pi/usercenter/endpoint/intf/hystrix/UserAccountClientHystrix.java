package com.pi.usercenter.endpoint.intf.hystrix;

import com.pi.usercenter.endpoint.intf.UserAccountClient;
import com.pi.usercenter.endpoint.vo.UserAccountVo;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class UserAccountClientHystrix implements UserAccountClient {

    @Override
    public List<UserAccountVo> getAllUserAccounts() {
        UserAccountVo vo = new UserAccountVo();
        vo.setNick("error");
        return Collections.singletonList(vo);
    }

}