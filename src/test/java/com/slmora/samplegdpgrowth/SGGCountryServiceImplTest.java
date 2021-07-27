/*
 * Created by IntelliJ IDEA.
 * @Author: SLMORA
 * @DateTime: 7/27/2021 11:58 AM
 */
package com.slmora.samplegdpgrowth;

import com.slmora.samplegdpgrowth.dao.repository.ISGGCountryRepository;
import com.slmora.samplegdpgrowth.entity.SGGCountry;
import com.slmora.samplegdpgrowth.service.impl.SGGCountryServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

/**
 * This Class created for
 *
 * @Author: SLMORA
 * @DateTime: 7/27/2021 11:58 AM
 * <p>
 * Version      Date            Editor              Note
 * ----------------------------------------------------------------------------------------------------------------
 * 1.0          7/27/2021      SLMORA                Initial Code
 */
public class SGGCountryServiceImplTest
{
    @InjectMocks
    private SGGCountryServiceImpl countryService;

    @Mock
    private ISGGCountryRepository countryRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getCountryNameByCountryAlpha3SuccessValidCountry() {
        when(countryRepository.findByCountryAlpha3(anyString())).thenReturn(returnSGGCountry());
        Optional<String> countryName = countryService.getCountryNameByCountryAlpha3("LKA");

        Assertions.assertTrue(countryName.isPresent());
        Assertions.assertEquals("Sri Lanka", countryName.get());
    }

    @Test
    public void getCountryNameByCountryAlpha2SuccessValidCountry() {
        when(countryRepository.findByCountryAlpha2(anyString())).thenReturn(returnSGGCountry());
        Optional<String> countryName = countryService.getCountryNameByCountryAlpha2("LK");

        Assertions.assertTrue(countryName.isPresent());
        Assertions.assertEquals("Sri Lanka", countryName.get());
    }

    @Test
    public void getCountryNameByCountryAlpha3SuccessInvalidCountry() {
        when(countryRepository.findByCountryAlpha3(anyString())).thenReturn(Optional.empty());
        Optional<String> countryName = countryService.getCountryNameByCountryAlpha3("LKA");

        Assertions.assertFalse(countryName.isPresent());
    }

    private Optional<SGGCountry> returnSGGCountry() {
        SGGCountry sggCountry = new SGGCountry();
        sggCountry.setCountryId(1);
        sggCountry.setCountryAlpha2("LK");
        sggCountry.setCountryAlpha3("LKA");
        sggCountry.setCountryName("Sri Lanka");
        sggCountry.setCountryNumeric("144");
        return Optional.of(sggCountry);
    }
}
