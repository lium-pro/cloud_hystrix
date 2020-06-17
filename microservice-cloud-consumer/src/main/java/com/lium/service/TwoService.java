package com.lium.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "MICROSERVICE-CLOUD-PROVIDER" , fallbackFactory = TwoServiceFallBack.class)
public interface TwoService {
    @GetMapping("v1/get")
    public String show2();

    @GetMapping("show")
    public List showWebsite();
}
