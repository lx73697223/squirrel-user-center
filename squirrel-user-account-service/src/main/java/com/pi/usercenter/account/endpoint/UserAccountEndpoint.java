package com.pi.usercenter.account.endpoint;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pi.common.utils.core.sequence.UniqueIdGenerator;
import com.pi.usercenter.account.biz.UserAccountManagementService;
import com.pi.usercenter.account.biz.dto.UserAccountDto;
import com.pi.usercenter.endpoint.intf.UserAccountClient;
import com.pi.usercenter.endpoint.vo.UserAccountVo;

import ma.glasnost.orika.MapperFacade;

@RestController
public class UserAccountEndpoint implements UserAccountClient {

    @Autowired
    private UserAccountManagementService userAccountManagementService;

    @Autowired
    private MapperFacade beanMapper;

    @Autowired
    private UniqueIdGenerator uniqueIdGenerator;

    @Override
    public ResponseEntity<List<UserAccountVo>> getUserAccounts(@RequestParam("ids") Set<String> ids) {
        List<UserAccountDto> userAccountDtos = userAccountManagementService.findByIds(ids, null);
        return ResponseEntity.ok(beanMapper.mapAsList(userAccountDtos, UserAccountVo.class));
    }

    @Override
    public UserAccountVo getUserAccountByUsername(@PathVariable("username") String username) {
        UserAccountDto userAccountDto = userAccountManagementService.findByUsername(username, null);
        return beanMapper.map(userAccountDto, UserAccountVo.class);
    }

    @GetMapping(value = "/uniqueIds", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Long> getUniqueId() {
        return ResponseEntity.ok(uniqueIdGenerator.next());
    }

}
