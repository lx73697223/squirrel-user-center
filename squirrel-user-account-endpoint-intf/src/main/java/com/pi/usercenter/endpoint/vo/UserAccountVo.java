package com.pi.usercenter.endpoint.vo;

import com.pi.common.utils.entity.UniqueIdEntity;
import com.pi.usercenter.enums.UserGender;
import lombok.Data;

@Data
public class UserAccountVo extends UniqueIdEntity {

    private String username;

    private String nick;

    private UserGender gender;

    private String phone;

}
