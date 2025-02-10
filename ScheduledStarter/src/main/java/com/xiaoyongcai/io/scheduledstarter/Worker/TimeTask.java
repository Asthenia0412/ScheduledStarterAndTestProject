package com.xiaoyongcai.io.scheduledstarter.Worker;

import com.xiaoyongcai.io.scheduledstarter.Properties.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

public class TimeTask {
    @Autowired
    private Message message;
    int count = 0;

    @Scheduled(cron = "${xyc.config.cron}")
    public void notice() {
        System.out.println(message.getName()  + "说：" + message.getMessage()  + ":定时任务执行了" + (++count) + "次" + System.currentTimeMillis());
    }
}