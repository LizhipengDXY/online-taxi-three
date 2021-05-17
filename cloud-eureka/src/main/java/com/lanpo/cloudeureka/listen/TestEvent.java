package com.lanpo.cloudeureka.listen;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.stereotype.Component;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author li zhipeng
 * @date 2021/5/17
 * @Description:
 */
@Component
public class TestEvent {
    public void listen(EurekaInstanceCanceledEvent e){
        // 发邮件
    }

    public static void main(String[] args){
        Timer  timer = new Timer("w");
        TimerTask t = new TimerTask() {
            @Override
            public void run() {
                System.out.println("s");
            }
        };
        new Timer().schedule(t,1);
    }
}
