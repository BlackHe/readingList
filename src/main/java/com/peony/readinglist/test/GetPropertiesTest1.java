package com.peony.readinglist.test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ConfigurationProperties(prefix = "amazon")
public class GetPropertiesTest1 {

    private String associateId;

    @GetMapping("/getProperties")
    public String getProperties() {
        System.out.println(this.associateId);
        return this.associateId;
    }

    public void setAssociateId(String associateId) {
        this.associateId = associateId;
    }

}
