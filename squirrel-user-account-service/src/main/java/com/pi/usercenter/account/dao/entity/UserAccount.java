package com.pi.usercenter.account.dao.entity;

import com.pi.common.utils.entity.UniqueIdEntity;
import com.pi.usercenter.enums.UserGender;
import lombok.Data;

@Data
public class UserAccount extends UniqueIdEntity {

    private String username;

    private String nick;

    private UserGender gender;

    private String phone;

}
