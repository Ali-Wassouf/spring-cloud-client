package com.ali.wassouf.spring.cloud.client.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Ali Wassouf
 */
@Component
@ConfigurationProperties(prefix = "test")
public class TestProperties {

    private String profile;

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
