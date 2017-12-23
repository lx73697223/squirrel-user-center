package com.pi.usercenter.account.dao.mapper;

import com.pi.common.persistence.orm.mybatis.mapper.BaseMapper;
import com.pi.common.utils.entity.FieldsExpandParam;
import com.pi.usercenter.account.biz.pojo.UserAcountQueryPojo;
import com.pi.usercenter.account.dao.entity.UserAccount;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserAccountMapper extends BaseMapper<UserAccount, String> {

    List<UserAccount> find(@Param("pojo") UserAcountQueryPojo pojo,
                           @Param("fieldsExpandParam") FieldsExpandParam fieldsExpandParam);

}
