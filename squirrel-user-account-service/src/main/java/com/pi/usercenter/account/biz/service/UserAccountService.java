package com.pi.usercenter.account.biz.service;

import com.google.common.collect.Lists;
import com.pi.common.utils.aop.annotation.ExecuteByBatch;
import com.pi.common.utils.core.IteratorUtils;
import com.pi.common.utils.core.sequence.UniqueIdGenerator;
import com.pi.common.utils.entity.FieldsExpandParam;
import com.pi.usercenter.account.biz.dto.UserAccountDto;
import com.pi.usercenter.account.biz.pojo.UserAcountQueryPojo;
import com.pi.usercenter.account.dao.entity.UserAccount;
import com.pi.usercenter.account.dao.mapper.UserAccountMapper;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class UserAccountService {

    @Autowired
    private UserAccountMapper userAccountMapper;

    @Autowired
    private MapperFacade beanMapper;

    @Autowired
    private UniqueIdGenerator uniqueIdGenerator;

    @ExecuteByBatch
    public List<UserAccountDto> findByIds(Collection<String> ids,
                                          FieldsExpandParam fieldsExpandParam) {
        List<UserAccount> result = userAccountMapper.findByIds(ids, fieldsExpandParam);
        return beanMapper.mapAsList(result, UserAccountDto.class);
    }

    public List<UserAccountDto> findUsers(UserAcountQueryPojo queryPojo, FieldsExpandParam fieldsExpandParam) {
        List<UserAccount> result = userAccountMapper.find(queryPojo, fieldsExpandParam);
        return beanMapper.mapAsList(result, UserAccountDto.class);
    }

    public String save(UserAccount entity) {
        entity.setUniqueId(uniqueIdGenerator.next());
        int result = userAccountMapper.saveBatch(Lists.newArrayList(entity));
        return entity.getUniqueId();
    }

}
