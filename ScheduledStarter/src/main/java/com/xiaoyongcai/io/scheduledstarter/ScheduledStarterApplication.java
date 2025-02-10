package com.xiaoyongcai.io.scheduledstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class ScheduledStarterApplication{

    public static void main(String[] args) {
        SpringApplication.run(ScheduledStarterApplication.class, args);
    }

}
