package com.learn.fanrestapi.domain;

import lombok.Data;

@Data
public class Fan {
    private Long id;
    private FanType type;
    private String company;
    private Double price;
}

