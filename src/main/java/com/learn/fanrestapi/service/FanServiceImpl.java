package com.learn.fanrestapi.service;

import com.learn.fanrestapi.domain.Fan;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static com.learn.fanrestapi.domain.FanType.CEILING;

@Slf4j
@Service
public class FanServiceImpl implements FanService {
    private Long fanId = 100L;
    private final Map<Long, Fan> fanMap = new HashMap<>();

    // static block
    {
        Fan fan = new Fan();
        fan.setId(fanId);
        fan.setType(CEILING);
        fan.setCompany("POLAR");
        fan.setPrice(10.0);

        fanMap.put(fan.getId(), fan);
    }

    @Override
    public Collection<Fan> findAll() {
        log.info("-------- Inside FanServiceImpl - findAll() ------");
        return fanMap.values();
    }

    @Override
    public Fan findById(Long id) {
        log.info("-------- Inside FanServiceImpl - findById() ------");
        return fanMap.get(id);
    }

    @Override
    public Fan saveFan(Fan fan) {
        log.info("-------- Inside FanServiceImpl - saveFan() ------");
        Long newFandId = ++fanId;
        fan.setId(newFandId);
        fanMap.put(fan.getId(), fan);
        return fanMap.get(newFandId);
    }

    @Override
    public Fan updateFan(Fan fan) {
        log.info("-------- Inside FanServiceImpl - updateFan() ------");
        return null;
    }

    @Override
    public Fan deleteById(Long id) {
        log.info("-------- Inside FanServiceImpl - deleteById() ------");
        return null;
    }
}
