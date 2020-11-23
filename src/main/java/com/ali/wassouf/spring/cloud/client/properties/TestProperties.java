package com.ali.wassouf.spring.cloud.client.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ali Wassouf
 */
@Configuration
@RefreshScope
public class TestProperties {

    @Value("${someproperty}")
    private String profile;

    public String getProfile() {
        return profile;
    }

    public TestProperties setProfile(String profile) {
        this.profile = profile;
        return this;
    }
}
