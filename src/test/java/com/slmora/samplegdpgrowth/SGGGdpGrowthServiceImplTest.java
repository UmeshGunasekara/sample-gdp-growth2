/*
 * Created by IntelliJ IDEA.
 * @Author: SLMORA
 * @DateTime: 7/27/2021 12:12 PM
 */
package com.slmora.samplegdpgrowth;

import com.slmora.samplegdpgrowth.dao.repository.ISGGGdpGrowthRepository;
import com.slmora.samplegdpgrowth.entity.SGGGdpGrowth;
import com.slmora.samplegdpgrowth.service.impl.SGGGdpGrowthServiceImpl;
import com.slmora.samplegdpgrowth.vo.GdpGrowthVo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.modelmapper.ModelMapper;


import java.util.Collections;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

/**
 * This Class created for
 *
 * @Author: SLMORA
 * @DateTime: 7/27/2021 12:12 PM
 * <p>
 * Version      Date            Editor              Note
 * ----------------------------------------------------------------------------------------------------------------
 * 1.0          7/27/2021      SLMORA                Initial Code
 */
public class SGGGdpGrowthServiceImplTest
{
    @InjectMocks
    private SGGGdpGrowthServiceImpl gdpGrowthService;

    @Mock
    private ISGGGdpGrowthRepository growthRepository;

    @Spy
    private ModelMapper modelMapper = new ModelMapper();

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getGdpGrowthListByCountryAlpha3Success() {
        when(growthRepository.findByGdpGrowthCountryAlpha3(anyString())).thenReturn(getGdpGrowthVos());
        List<GdpGrowthVo> gdpGrowthVoList = gdpGrowthService.getGdpGrowthListByCountryAlpha3("LKA");

        Assertions.assertNotNull(gdpGrowthVoList);
        Assertions.assertEquals(1, gdpGrowthVoList.size());
    }

    private List<SGGGdpGrowth> getGdpGrowthVos() {
        SGGGdpGrowth sgggdpGrowth = new SGGGdpGrowth();
        sgggdpGrowth.setGdpGrowthId(1);
        sgggdpGrowth.setGdpGrowthYear(2015);
        sgggdpGrowth.setGdpGrowthValue(80611989527F);
        sgggdpGrowth.setGdpGrowthCountryAlpha3("LKA");

        return Collections.singletonList(sgggdpGrowth);
    }
}
