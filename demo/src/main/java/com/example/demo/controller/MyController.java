package com.example.demo.controller;


import com.example.demo.model.Country;
import com.example.demo.service.ICountryService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.List;

@Controller
public class MyController {
    @Autowired
    ICountryService countryService;

    public String findcities(){

        var countries = (List<Country>)countryService.findAll();
        var params = new HashMap<String,Object>();
        params.put("countries",countries);

        params.toString();

        return params.toString();

    }

}
