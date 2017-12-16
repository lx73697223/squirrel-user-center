package com.pi.usercenter.account.dao.entity;

import com.pi.common.utils.entity.IdEntity;
import lombok.Data;

@Data
public class UserAccount extends IdEntity {

    private String username;

    private String nick;

    private String phone;

}
