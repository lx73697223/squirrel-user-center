package com.pi.usercenter.account.biz;

import com.pi.usercenter.account.biz.service.UserAccountService;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountManagementService {

    @Autowired
    private UserAccountService userAccountService;

    @Autowired
    private MapperFacade beanMapper;

}
