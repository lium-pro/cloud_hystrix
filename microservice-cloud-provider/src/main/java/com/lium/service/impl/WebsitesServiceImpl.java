package com.lium.service.impl;

import com.lium.bean.Websites;
import com.lium.mapper.WebsitesMapper;
import com.lium.service.WebsitesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebsitesServiceImpl implements WebsitesService {
    @Autowired
    private WebsitesMapper websitesMapper;
    @Value("${server.port}")
    private String port;

    @Override
    public List<Websites> show() {
        List<Websites> websites = websitesMapper.show();
        websites.forEach(websites1 -> websites1.setCountry(port));
        return websites;
    }
}
