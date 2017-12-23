package com.pi.usercenter.endpoint.intf.hystrix;

import com.pi.usercenter.endpoint.intf.UserAccountClient;
import com.pi.usercenter.endpoint.vo.UserAccountVo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Set;

@Component
public class UserAccountClientHystrix implements UserAccountClient {

    @Override
    public ResponseEntity<List<UserAccountVo>> getUserAccounts(Set<String> ids) {
        UserAccountVo mockUserVo = new UserAccountVo();
        mockUserVo.setUniqueId("0");
        mockUserVo.setNick("p");
        mockUserVo.setUsername("i");
        mockUserVo.setPhone("00000000000");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                Collections.singletonList(mockUserVo));
    }

    @Override
    public UserAccountVo getUserAccountByUsername(String username) {
        UserAccountVo mockUserVo = new UserAccountVo();
        return mockUserVo;
    }

}
