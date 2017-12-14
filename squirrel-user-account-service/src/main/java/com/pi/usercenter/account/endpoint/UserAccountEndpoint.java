package com.pi.usercenter.account.endpoint;

import com.pi.usercenter.account.dto.UserAccountDto;
import com.pi.usercenter.account.service.UserAccountService;
import com.pi.usercenter.endpoint.intf.UserAccountClient;
import com.pi.usercenter.endpoint.vo.UserAccountVo;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserAccountEndpoint implements UserAccountClient {

    @Autowired
    private UserAccountService userAccountService;

    @Autowired
    private MapperFacade beanMapper;

    @Override
    public List<UserAccountVo> getAllUserAccounts() {
        List<UserAccountDto> userAccountDtos = userAccountService.findAll();
        return beanMapper.mapAsList(userAccountDtos, UserAccountVo.class);
    }

}
