/*
 * Created by IntelliJ IDEA.
 * @Author: SLMORA
 * @DateTime: 7/27/2021 8:29 AM
 */
package com.slmora.samplegdpgrowth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This Class created for
 *
 * @Author: SLMORA
 * @DateTime: 7/27/2021 8:29 AM
 * <p>
 * Version      Date            Editor              Note
 * ----------------------------------------------------------------------------------------------------------------
 * 1.0          7/27/2021      SLMORA                Initial Code
 */
@RestController
public class WelcomeCotroller
{
    @Value("${app-title}")
    private String projectTitle;

    @GetMapping("/")
    public String wellcome()
    {
        return "Wellcome "+projectTitle;
    }
}
