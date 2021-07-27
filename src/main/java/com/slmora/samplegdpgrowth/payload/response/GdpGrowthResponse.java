/*
 * Created by IntelliJ IDEA.
 * @Author: SLMORA
 * @DateTime: 7/27/2021 10:10 AM
 */
package com.slmora.samplegdpgrowth.payload.response;

import com.slmora.samplegdpgrowth.vo.GdpGrowthVo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * This Class created for
 *
 * @Author: SLMORA
 * @DateTime: 7/27/2021 10:10 AM
 * <p>
 * Version      Date            Editor              Note
 * ----------------------------------------------------------------------------------------------------------------
 * 1.0          7/27/2021      SLMORA                Initial Code
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GdpGrowthResponse
{
    private String country;
    private List<GdpGrowthVo> gdpgrowth;
}
