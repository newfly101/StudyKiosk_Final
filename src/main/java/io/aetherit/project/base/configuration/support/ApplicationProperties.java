package io.aetherit.project.base.configuration.support;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "project.base.application")
@Data
public class ApplicationProperties {
    private int networkConnTimeout;
    private int networkReadTimeout;
}
