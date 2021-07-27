/*
 * Created by IntelliJ IDEA.
 * @Author: SLMORA
 * @DateTime: 7/27/2021 8:34 AM
 */
package com.slmora.samplegdpgrowth.service.impl;

import com.slmora.samplegdpgrowth.dao.repository.ISGGCountryRepository;
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

    @Override
    public Optional<String> getCountryNameByCountryAlpha3(String countryAlpha3)
    {
        return Optional.empty();
    }
}
