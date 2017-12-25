package com.peony.readinglist.test;

import com.peony.readinglist.bean.AmazonPropertiesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetPropertiesTest2 {

    @Autowired
    private AmazonPropertiesBean amazonProperties;

    @GetMapping("/getProperties2")
    public String getProperties() {
        System.out.println(this.amazonProperties.getAssociateId());
        return this.amazonProperties.getAssociateId();
    }
}
