package com.pi.usercenter.account.biz.dto;

import com.pi.common.utils.entity.UniqueIdEntity;
import com.pi.usercenter.enums.UserGender;
import lombok.Data;

@Data
public class UserAccountDto extends UniqueIdEntity {

    private String username;

    private String nick;

    private UserGender gender;

    private String phone;

    private String password;

}
