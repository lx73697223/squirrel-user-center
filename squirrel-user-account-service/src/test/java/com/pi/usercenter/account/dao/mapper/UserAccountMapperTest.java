package com.pi.usercenter.account.dao.mapper;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.pi.common.test.DaoTests;
import com.pi.usercenter.account.dao.entity.UserAccount;
import com.pi.usercenter.enums.UserGender;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class UserAccountMapperTest extends DaoTests {

    @Autowired
    private UserAccountMapper userAccountMapper;

    //    @Autowired
    //    private UniqueIdGenerator uniqueIdGenerator;

    @Test
    public void findByIds() {
        List<UserAccount> list = userAccountMapper.findByIds(Sets.newHashSet("1", "2"), null);
        assertThat(list).hasSize(2);
    }

    @Test
    @DirtiesContext
    public void saveBatch() {
        long uniqueId = 100L; /*uniqueIdGenerator.next();*/
        UserAccount userAccount = new UserAccount();
        userAccount.setUniqueId(uniqueId);
        userAccount.setGender(UserGender.FEMALE);
        userAccount.setNick("nick");
        userAccount.setPhone("12345678901");
        userAccount.setUsername("username");
        userAccount.setCreatedBy(uniqueId);

        List<UserAccount> list = Lists.newArrayList(userAccount);
        int result = userAccountMapper.saveBatch(list);
        assertThat(result).isEqualTo(list.size());
    }
}
