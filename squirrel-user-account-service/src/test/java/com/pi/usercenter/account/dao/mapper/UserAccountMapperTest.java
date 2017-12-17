package com.pi.usercenter.account.dao.mapper;

import com.google.common.collect.Sets;
import com.pi.common.test.DaoTests;
import com.pi.usercenter.account.dao.entity.UserAccount;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class UserAccountMapperTest extends DaoTests {

    @Autowired
    private UserAccountMapper userAccountMapper;

    @Test
    public void findByIds() {
        List<UserAccount> list = userAccountMapper.findByIds(Sets.newHashSet(1L, 2L), null);
        assertThat(list).hasSize(2);
    }

}
