package com.pi.usercenter.account.config;

import com.pi.common.utils.core.sequence.SnowflakeIdGenerator;
import com.pi.common.utils.core.sequence.UniqueIdGenerator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class UniqueIdGeneratorConfiguration {

    @Value("${spring.application.instance-id:0}")
    private int instanceId;

    @Bean
    @Primary
    public UniqueIdGenerator uniqueIdGenerator() {
        SnowflakeIdGenerator idGenerator = new SnowflakeIdGenerator(instanceId);
        return idGenerator;
    }

}
