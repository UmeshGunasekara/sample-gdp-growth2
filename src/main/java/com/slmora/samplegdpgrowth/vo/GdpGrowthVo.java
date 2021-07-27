/*
 * Created by IntelliJ IDEA.
 * @Author: SLMORA
 * @DateTime: 7/27/2021 10:13 AM
 */
package com.slmora.samplegdpgrowth.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * This Class created for
 *
 * @Author: SLMORA
 * @DateTime: 7/27/2021 10:13 AM
 * <p>
 * Version      Date            Editor              Note
 * ----------------------------------------------------------------------------------------------------------------
 * 1.0          7/27/2021      SLMORA                Initial Code
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GdpGrowthVo implements Serializable
{
    private static final long serialVersionUID = -4514003373860987443L;

    private Integer gdpGrowthYear;
    private Float gdpGrowthValue;

}
