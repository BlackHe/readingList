package com.peony.readinglist.test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "amazon")
public class GetPropertiesTest1 {

    private String associateId;

    @GetMapping("/getProperties1")
    public String getProperties() {
        System.out.println(this.associateId);
        return this.associateId;
    }

    public void setAssociateId(String associateId) {
        this.associateId = associateId;
    }

}
