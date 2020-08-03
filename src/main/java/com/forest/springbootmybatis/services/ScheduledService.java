package com.forest.springbootmybatis.services;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {

    // second minute hour date month day
    @Scheduled(cron = "30 15 10 * * ?")
    public void hello() {
        System.out.println("Hello, you are executed.");
    }
}
