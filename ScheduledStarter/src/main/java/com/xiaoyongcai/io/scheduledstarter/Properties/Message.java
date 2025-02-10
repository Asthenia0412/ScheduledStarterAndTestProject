package com.xiaoyongcai.io.scheduledstarter.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "xyc.config")
public class Message {
    private String name;
    private String message;
    private String cron;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name  = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message  = message;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron  = cron;
    }
}