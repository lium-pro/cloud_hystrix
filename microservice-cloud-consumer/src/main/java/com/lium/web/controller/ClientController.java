package com.lium.web.controller;

import com.lium.service.TwoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ClientController<T> {

   /* @Autowired
    private RestTemplate restTemplate;*/

    @GetMapping("v2/show")
    @ResponseBody
    @ApiOperation(value = "获取网站内容",notes = "暴力哦")
    public List show() {
        /*String url = "http://MICROSERVICE-CLOUD-PROVIDER/show";
        ResponseEntity<List> forEntity = restTemplate.getForEntity(url, List.class);
        return forEntity.getBody();*/
        return twoService.showWebsite();
    }


    @Resource
    private TwoService twoService;

    @GetMapping("v2/get")
    @ResponseBody
    @ApiOperation(value = "获取私密地址",notes = "哦买噶")
    public String getShow() {
        return twoService.show2();
    }
}
