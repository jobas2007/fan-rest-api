package com.learn.fanrestapi.resource;


import com.learn.fanrestapi.domain.Fan;
import com.learn.fanrestapi.service.FanService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Slf4j
@RestController
@RequestMapping("/fans")
@RequiredArgsConstructor
public class FanResource {
    private final FanService service;

    @GetMapping
    public Collection<Fan> findAll() {
        log.info("-------- Inside FanResource - findAll() -----------");
        return service.findAll();
    }

    @GetMapping("{id}")
    public Fan findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Fan save(@RequestBody Fan fan) {
        return service.saveFan(fan);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Fan update(@RequestBody Fan fan) {
        return service.updateFan(fan);
    }

    @DeleteMapping("{id}")
    public Fan deleteById(@PathVariable Long id) {
        return service.deleteById(id);
    }
}
