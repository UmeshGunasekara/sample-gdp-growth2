/*
 * Created by IntelliJ IDEA.
 * @Author: SLMORA
 * @DateTime: 7/27/2021 8:31 AM
 */
package com.slmora.samplegdpgrowth.api.v01.resource;

import com.slmora.samplegdpgrowth.service.ISGGGdpGrowthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This Class created for
 *
 * @Author: SLMORA
 * @DateTime: 7/27/2021 8:31 AM
 * <p>
 * Version      Date            Editor              Note
 * ----------------------------------------------------------------------------------------------------------------
 * 1.0          7/27/2021      SLMORA                Initial Code
 */
@RestController
@RequestMapping("/api/v01/gdpgrowth")
public class GdpGrowthResource
{
    private static final Logger logger = LoggerFactory.getLogger(GdpGrowthResource.class);

    @Autowired
    private ISGGGdpGrowthService gdpGrowthService;

}
