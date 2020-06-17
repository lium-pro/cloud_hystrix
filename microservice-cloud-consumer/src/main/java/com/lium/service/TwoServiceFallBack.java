package com.lium.service;

import com.lium.bean.Websites;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TwoServiceFallBack implements FallbackFactory<TwoService> {

    @Override
    public TwoService create(Throwable throwable) {
        return new TwoService() {
            @Override
            public String show2() {
                return "哦豁! 服务生病病啦";
            }

            @Override
            public List showWebsite() {
                Websites websites = new Websites();
                websites.setCountry("中国");
                websites.setAlexa(10086);
                websites.setName("蜘蛛侠");
                websites.setUrl("www.meng.com");
                websites.setId(10086);
                List list = new ArrayList();
                list.add(websites);
                return list;
            }
        };
    }
}
