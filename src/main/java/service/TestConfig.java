package service;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config.properties")
public interface TestConfig extends Config {
    @Key("baseUrl")
    String getBaseUrl();
}
