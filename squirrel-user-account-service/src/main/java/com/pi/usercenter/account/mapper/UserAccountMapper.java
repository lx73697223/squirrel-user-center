package com.pi.usercenter.account.mapper;

import com.pi.usercenter.account.entity.UserAccount;
import com.pi.usercenter.endpoint.vo.UserAccountVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserAccountMapper {

    @Select("SELECT id, username, nick, phone FROM user_account WHERE id = #{id}")
    UserAccount findById(@Param("id") Long id);

    @Select("SELECT id, username, nick, phone FROM user_account")
    List<UserAccount> findAll();
}
