package com.pi.usercenter.account.biz;

import com.pi.common.utils.core.IteratorUtils;
import com.pi.common.utils.entity.FieldsExpandParam;
import com.pi.usercenter.account.biz.dto.UserAccountDto;
import com.pi.usercenter.account.biz.pojo.UserAcountQueryPojo;
import com.pi.usercenter.account.biz.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

@Service
public class UserAccountManagementService {

    @Autowired
    private UserAccountService userAccountService;

    public List<UserAccountDto> findByIds(Set<String> ids, FieldsExpandParam fieldsExpandParam) {
        return userAccountService.findByIds(ids, fieldsExpandParam);
    }

    public UserAccountDto findById(String id, FieldsExpandParam fieldsExpandParam) {
        return IteratorUtils.getFirstOrNull(
                findByIds(Collections.singleton(id), fieldsExpandParam));
    }

    public UserAccountDto findByUsername(String username, FieldsExpandParam fieldsExpandParam) {
        UserAcountQueryPojo queryPojo = new UserAcountQueryPojo();
        queryPojo.setUsernames(Collections.singleton(username));

        return IteratorUtils.getFirstOrNull(
                userAccountService.findUsers(queryPojo, fieldsExpandParam));
    }

}
