/*
 * Created by IntelliJ IDEA.
 * @Author: SLMORA
 * @DateTime: 7/27/2021 8:33 AM
 */
package com.slmora.samplegdpgrowth.service;

import java.util.Optional;

/**
 * This Interface created for
 *
 * @Author: SLMORA
 * @DateTime: 7/27/2021 8:33 AM
 * <p>
 * Version      Date            Editor              Note
 * ----------------------------------------------------------------------------------------------------------------
 * 1.0          7/27/2021      SLMORA                Initial Code
 */
public interface ISGGCountryService
{
    public Optional<String> getCountryNameByCountryAlpha3(String countryAlpha3);
    public Optional<String> getCountryNameByCountryAlpha2(String countryAlpha2);
    public Optional<String> getCountryAlpha3ByCountryAlpha2(String countryAlpha2);
}
