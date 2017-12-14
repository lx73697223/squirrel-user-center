package com.pi.usercenter.account.service;

import com.pi.usercenter.account.dto.UserAccountDto;
import com.pi.usercenter.account.entity.UserAccount;
import com.pi.usercenter.account.mapper.UserAccountMapper;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountService {

    @Autowired
    private UserAccountMapper userAccountMapper;

    @Autowired
    private MapperFacade beanMapper;

    public UserAccountDto findById(Long id) {
        UserAccount result = userAccountMapper.findById(id);
        return beanMapper.map(result, UserAccountDto.class);
    }

    public List<UserAccountDto> findAll() {
        List<UserAccount> result = userAccountMapper.findAll();
        return beanMapper.mapAsList(result, UserAccountDto.class);
    }
}
