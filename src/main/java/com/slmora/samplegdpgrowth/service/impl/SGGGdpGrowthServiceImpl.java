/*
 * Created by IntelliJ IDEA.
 * @Author: SLMORA
 * @DateTime: 7/27/2021 8:34 AM
 */
package com.slmora.samplegdpgrowth.service.impl;

import com.slmora.samplegdpgrowth.dao.repository.ISGGGdpGrowthRepository;
import com.slmora.samplegdpgrowth.service.ISGGGdpGrowthService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * This Class created for
 *
 * @Author: SLMORA
 * @DateTime: 7/27/2021 8:34 AM
 * <p>
 * Version      Date            Editor              Note
 * ----------------------------------------------------------------------------------------------------------------
 * 1.0          7/27/2021      SLMORA                Initial Code
 */
@Service
@Transactional
public class SGGGdpGrowthServiceImpl implements ISGGGdpGrowthService
{
    private final ModelMapper modelMapper;
    private final ISGGGdpGrowthRepository growthRepository;

    @Autowired
    public SGGGdpGrowthServiceImpl(ModelMapper modelMapper,
                                   ISGGGdpGrowthRepository growthRepository)
    {
        this.modelMapper = modelMapper;
        this.growthRepository = growthRepository;
    }

}
