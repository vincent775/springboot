package com.example.demo.service;

import com.example.demo.Repository.CountryRepository;
import com.example.demo.model.Country;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService implements ICountryService {
    @Autowired
    private CountryRepository repository;

    @Override
    public List<Country> findAll(){
        var countries = (List<Country>)repository.findAll();
        return countries;
    }
}
