package com.pi.usercenter.account.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("user_account")
public class UserAccount {

    private Long id;

    private String username;

    private String nick;

    private String phone;

}
