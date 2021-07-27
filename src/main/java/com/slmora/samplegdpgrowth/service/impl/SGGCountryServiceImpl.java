/*
 * Created by IntelliJ IDEA.
 * @Author: SLMORA
 * @DateTime: 7/27/2021 8:34 AM
 */
package com.slmora.samplegdpgrowth.service.impl;

import com.slmora.samplegdpgrowth.dao.repository.ISGGCountryRepository;
import com.slmora.samplegdpgrowth.entity.SGGCountry;
import com.slmora.samplegdpgrowth.service.ISGGCountryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

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
public class SGGCountryServiceImpl implements ISGGCountryService
{
    private final ModelMapper modelMapper;
    private final ISGGCountryRepository countryRepository;

    @Autowired
    public SGGCountryServiceImpl(ModelMapper modelMapper,
                             ISGGCountryRepository countryRepository)
    {
        this.modelMapper = modelMapper;
        this.countryRepository = countryRepository;
    }

    /**
     *
     * @param countryAlpha3 value of country alpha code 3
     * @return country name related to given country alpha code 3
     */
    @Override
    public Optional<String> getCountryNameByCountryAlpha3(String countryAlpha3)
    {
        Optional<SGGCountry> opCountry = countryRepository.findByCountryAlpha3(countryAlpha3);
        if(opCountry.isPresent()){
            return Optional.of(opCountry.get().getCountryName());
        }else{
            return Optional.empty();
        }
    }

    /**
     *
     * @param countryAlpha2 value of country alpha code 2
     * @return country name related to given country alpha code 2
     */
    @Override
    public Optional<String> getCountryNameByCountryAlpha2(String countryAlpha2)
    {
        Optional<SGGCountry> opCountry = countryRepository.findByCountryAlpha2(countryAlpha2);
        if(opCountry.isPresent()){
            return Optional.of(opCountry.get().getCountryName());
        }else{
            return Optional.empty();
        }
    }

    /**
     *
     * @param countryAlpha2 value of country alpha code 2
     * @return country alpha code 3 related to given country alpha code 2
     *
     * This will help to add support alpha code 2 compatibility of the GdpGrowthResource
     */
    @Override
    public Optional<String> getCountryAlpha3ByCountryAlpha2(String countryAlpha2)
    {
        Optional<SGGCountry> opCountry = countryRepository.findByCountryAlpha2(countryAlpha2);
        if(opCountry.isPresent()){
            return Optional.of(opCountry.get().getCountryAlpha3());
        }else{
            return Optional.empty();
        }
    }
}
