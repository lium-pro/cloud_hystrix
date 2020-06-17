package com.lium.mapper;

import com.lium.bean.Websites;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface WebsitesMapper {
    @Select(" select * from websites  ")
    List<Websites> show();
}
