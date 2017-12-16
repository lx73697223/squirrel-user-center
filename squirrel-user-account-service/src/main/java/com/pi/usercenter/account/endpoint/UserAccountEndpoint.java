package com.pi.usercenter.account.endpoint;

import com.pi.usercenter.account.biz.dto.UserAccountDto;
import com.pi.usercenter.account.biz.service.UserAccountService;
import com.pi.usercenter.endpoint.intf.UserAccountClient;
import com.pi.usercenter.endpoint.vo.UserAccountVo;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class UserAccountEndpoint implements UserAccountClient {

    @Autowired
    private UserAccountService userAccountService;

    @Autowired
    private MapperFacade beanMapper;

    @Override
    public ResponseEntity<List<UserAccountVo>> getUserAccounts(@RequestParam("ids") Set<Long> ids) {
        List<UserAccountDto> userAccountDtos = userAccountService.findByIds(ids, null);
        return ResponseEntity.ok(beanMapper.mapAsList(userAccountDtos, UserAccountVo.class));
    }

}
