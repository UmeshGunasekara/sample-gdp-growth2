package com.slmora.samplegdpgrowth;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SampleGdpGrowthApplication
{

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }

    public static void main(String[] args)
    {
        SpringApplication.run(SampleGdpGrowthApplication.class, args);
    }

}
