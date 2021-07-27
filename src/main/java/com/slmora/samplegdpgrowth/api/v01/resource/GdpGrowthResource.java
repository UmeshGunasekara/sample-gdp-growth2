/*
 * Created by IntelliJ IDEA.
 * @Author: SLMORA
 * @DateTime: 7/27/2021 8:31 AM
 */
package com.slmora.samplegdpgrowth.api.v01.resource;

import com.slmora.samplegdpgrowth.dao.repository.ISGGCountryRepository;
import com.slmora.samplegdpgrowth.payload.response.GdpGrowthResponse;
import com.slmora.samplegdpgrowth.payload.response.MessageResponse;
import com.slmora.samplegdpgrowth.service.ISGGCountryService;
import com.slmora.samplegdpgrowth.service.ISGGGdpGrowthService;
import com.slmora.samplegdpgrowth.vo.GdpGrowthVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * This Class created for
 *
 * @Author: SLMORA
 * @DateTime: 7/27/2021 8:31 AM
 * <p>
 * Version      Date            Editor              Note
 * ----------------------------------------------------------------------------------------------------------------
 * 1.0          7/27/2021      SLMORA                Initial Code
 */
@RestController
@RequestMapping("/api/v01/gdpgrowth")
public class GdpGrowthResource
{
    private static final Logger logger = LoggerFactory.getLogger(GdpGrowthResource.class);

    @Autowired
    private ISGGGdpGrowthService gdpGrowthService;

    @Autowired
    private ISGGCountryService countryService;

    @GetMapping("/{country}")
    public ResponseEntity<?> redirectTo(@PathVariable String country){
        List<GdpGrowthVo> listGdpGrowthVo = new ArrayList<>();
        Optional<String> countryName = Optional.empty();
        if(country.length()==3){
            listGdpGrowthVo = gdpGrowthService.getGdpGrowthListByCountryAlpha3(country);
            countryName = countryService.getCountryNameByCountryAlpha3(country);
        }else if (country.length()==2){
            countryName = countryService.getCountryNameByCountryAlpha2(country);
            if(countryName.isPresent()){
                listGdpGrowthVo = gdpGrowthService.getGdpGrowthListByCountryAlpha3(countryService.getCountryAlpha3ByCountryAlpha2(country).get());
            }
        }

        if((!listGdpGrowthVo.isEmpty())
                && countryName.isPresent()
        ){
            return ResponseEntity.ok(
                    new GdpGrowthResponse(countryName.get(),
                            listGdpGrowthVo));
        }else{
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error Happened, URL not found"));
        }
    }

}
