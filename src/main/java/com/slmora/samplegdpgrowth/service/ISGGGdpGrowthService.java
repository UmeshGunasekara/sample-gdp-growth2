/*
 * Created by IntelliJ IDEA.
 * @Author: SLMORA
 * @DateTime: 7/27/2021 8:33 AM
 */
package com.slmora.samplegdpgrowth.service;

import com.slmora.samplegdpgrowth.vo.GdpGrowthVo;
import org.apache.catalina.LifecycleState;

import java.util.List;
import java.util.Optional;

/**
 * This Class created for
 *
 * @Author: SLMORA
 * @DateTime: 7/27/2021 8:33 AM
 * <p>
 * Version      Date            Editor              Note
 * ----------------------------------------------------------------------------------------------------------------
 * 1.0          7/27/2021      SLMORA                Initial Code
 */
public interface ISGGGdpGrowthService
{
    public List<GdpGrowthVo> getGdpGrowthListByCountryAlpha3(String countryAlpha3);
}
