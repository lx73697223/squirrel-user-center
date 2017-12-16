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

    public ResponseEntity<List<UserAccountVo>> getUserAccounts(Set<Long> ids) {
        UserAccountVo mockUserVo = new UserAccountVo();
        mockUserVo.setId(0L);
        mockUserVo.setNick("p");
        mockUserVo.setUsername("i");
        mockUserVo.setPhone("00000000000");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                Collections.singletonList(mockUserVo));
    }

}
