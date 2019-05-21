package com.mfinder.mlucard.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import com.mfinder.mlucard.constants.SecurityConstants;


@Configuration
@EnableResourceServer
public class ResourcesServerConfig extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(final ResourceServerSecurityConfigurer resources) {
        resources.resourceId(SecurityConstants.API_ENDPOINTS);
    }
}
