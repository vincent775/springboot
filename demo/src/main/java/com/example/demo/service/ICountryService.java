package com.example.demo.service;

import com.example.demo.model.Country;
import org.apache.kafka.common.metrics.stats.Count;

import java.util.List;

public interface ICountryService {
    public List<Country> findAll();
}


