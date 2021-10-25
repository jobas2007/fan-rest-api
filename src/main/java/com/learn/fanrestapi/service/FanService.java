package com.learn.fanrestapi.service;

import com.learn.fanrestapi.domain.Fan;

import java.util.Collection;

public interface FanService {
    Collection<Fan> findAll();

    Fan findById(Long id);

    Fan saveFan(Fan fan);

    Fan updateFan(Fan fan);

    Fan deleteById(Long id);

}
