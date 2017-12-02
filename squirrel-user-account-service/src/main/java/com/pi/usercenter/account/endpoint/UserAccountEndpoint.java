package com.pi.usercenter.account.endpoint;

import com.pi.usercenter.endpoint.intf.UserAccountClient;
import com.pi.usercenter.endpoint.vo.UserAccountVo;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class UserAccountEndpoint implements UserAccountClient {

    @Override
    public List<UserAccountVo> getAllUserAccounts() {
        UserAccountVo vo = new UserAccountVo();
        vo.setId(1L);
        vo.setUsername("132****5678");
        vo.setPhone("13212345678");
        vo.setNick("GG");
        return Collections.singletonList(vo);
    }

}
