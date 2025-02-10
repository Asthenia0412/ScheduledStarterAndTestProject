package com.xiaoyongcai.io.scheduledstarter.Config;

import com.xiaoyongcai.io.scheduledstarter.Properties.Message;
import com.xiaoyongcai.io.scheduledstarter.Worker.TimeTask;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class ScheduledStarterAutoConfiguration {

    @Bean
    public Message message() {
        return new Message();
    }

    @Bean
    public TimeTask timeTask() {
        return new TimeTask();
    }
}