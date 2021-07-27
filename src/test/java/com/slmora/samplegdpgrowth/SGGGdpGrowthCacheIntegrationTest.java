/*
 * Created by IntelliJ IDEA.
 * @Author: SLMORA
 * @DateTime: 7/27/2021 11:54 AM
 */
package com.slmora.samplegdpgrowth;

import com.slmora.samplegdpgrowth.configuration.cache.CacheConfig;
import com.slmora.samplegdpgrowth.dao.repository.ISGGGdpGrowthRepository;
import com.slmora.samplegdpgrowth.service.impl.SGGGdpGrowthServiceImpl;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * This Class created for
 *
 * @Author: SLMORA
 * @DateTime: 7/27/2021 11:54 AM
 * <p>
 * Version      Date            Editor              Note
 * ----------------------------------------------------------------------------------------------------------------
 * 1.0          7/27/2021      SLMORA                Initial Code
 */
@Import({ CacheConfig.class, SGGGdpGrowthServiceImpl.class })
@ExtendWith(SpringExtension.class)
@ImportAutoConfiguration(classes = { CacheAutoConfiguration.class, RedisAutoConfiguration.class })
@EnableCaching
public class SGGGdpGrowthCacheIntegrationTest
{
    @MockBean
    private ISGGGdpGrowthRepository mockGrowthRepository;
}
