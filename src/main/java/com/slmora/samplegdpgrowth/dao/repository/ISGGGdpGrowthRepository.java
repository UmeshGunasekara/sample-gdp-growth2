/*
 * Created by IntelliJ IDEA.
 * @Author: SLMORA
 * @DateTime: 7/27/2021 8:32 AM
 */
package com.slmora.samplegdpgrowth.dao.repository;

import com.slmora.samplegdpgrowth.entity.SGGGdpGrowth;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * This Interface created for
 *
 * @Author: SLMORA
 * @DateTime: 7/27/2021 8:32 AM
 * <p>
 * Version      Date            Editor              Note
 * ----------------------------------------------------------------------------------------------------------------
 * 1.0          7/27/2021      SLMORA                Initial Code
 */
public interface ISGGGdpGrowthRepository extends CrudRepository<SGGGdpGrowth, Integer>
{
    List<SGGGdpGrowth> findByGdpGrowthCountryAlpha3(String gdpGrowthCountryAlpha3);
}
