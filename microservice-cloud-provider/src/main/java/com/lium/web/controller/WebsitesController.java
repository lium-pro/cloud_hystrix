package com.lium.web.controller;

import com.lium.bean.Websites;
import com.lium.service.WebsitesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class WebsitesController {
    @Autowired
    private WebsitesService websitesService;

    @ResponseBody
    @GetMapping("show")
    public List<Websites> show() {
        return websitesService.show();
    }

    @Value("${server.port}")
    private String port;

    @ResponseBody
    @GetMapping("v1/get")
    public String show2() {
        return "此服务的端口：".concat(port);
    }

}
