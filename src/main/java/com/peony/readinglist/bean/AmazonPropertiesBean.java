package com.peony.readinglist.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Create by Intellij IDEA<p/>
 * author:black<p/>
 * description:
 */
@ConfigurationProperties(prefix = "amazon")
@Data
@Component
public class AmazonPropertiesBean {
    private String associateId;
}
